package comeit.framework.configure.spring.security;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import comeit.framework.common.utils.ApplicationProperty;
import comeit.framework.security.enhancer.ComeitTokenEnhancer;

/**
 * 스프링 시큐리티 OAuth 2.0 설정 클래스
 * 스프링 시큐리티 활성은 WebSecurityConfiguration 클래스에서 담당한다.
 * @author linuxp
 *
 */
public class OAuth2ServerConfiguration {
  @Configuration
  @EnableResourceServer
  protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
//    @Autowired
//    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
    
    @Autowired
    @Qualifier("applicationProperty")
    private ApplicationProperty applicationProperty;
    
    @Autowired
    private TokenStore tokenStore;
    
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
      //resources.resourceId(applicationProperty.getProperty("oauth.credentailClientId"));
      resources.tokenStore(tokenStore);
    }
    
    @Override
    public void configure(HttpSecurity http) throws Exception {
      // @formatter:off
      http
//          .exceptionHandling()
//            .authenticationEntryPoint(restAuthenticationEntryPoint)
//            .and()
        .logout()
          .logoutUrl("/oauth/logout")
        .and()
        .authorizeRequests()
//          .anyRequest().authenticated()
          .antMatchers("/test").permitAll()
//        .antMatchers("/greeting").authenticated();
//          .anyRequest().hasAnyRole("MEMBER", "CREDENTIALS_CLIENT")
      ;
      // @formatter:on
    }
  }
  
  @Configuration
  @EnableAuthorizationServer
  @EnableTransactionManagement
  protected static class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    protected final Logger log = LoggerFactory.getLogger(AuthorizationServerConfigurerAdapter.class);
    
    @Autowired
    @Qualifier("applicationProperty")
    private ApplicationProperty applicationProperty;
    
//    private TokenStore tokenStore = new InMemoryTokenStore();
    
    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private ComeitUserDetailsService userDetailsService;
    
    @Autowired
    private DataSource dataSource;
    
    @Bean
    protected AuthorizationCodeServices authorizationCodeServices() {
      return new JdbcAuthorizationCodeServices(dataSource);
    }
    
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
      // @formatter:off
      endpoints
        .authorizationCodeServices(authorizationCodeServices())
        .tokenStore(tokenStore())
        .authenticationManager(authenticationManager)
        .approvalStoreDisabled()
        .userDetailsService(userDetailsService)
        //.tokenEnhancer(tokenEnhancer())
        ;
      // @formatter:on
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
      log.debug("clientId : {}", applicationProperty.getProperty("oauth.clientId"));
      log.debug("clientSecret : {}", applicationProperty.getProperty("oauth.clientSecret"));
      log.debug("credentailsClientId : {}", applicationProperty.getProperty("oauth.credentailsClientId"));

      // @formatter:off
      clients
        .jdbc(dataSource)
          .withClient(applicationProperty.getProperty("oauth.clientId"))
            // 권한 부여 방식(비밀번호 인증, 리프레시 토큰, 보증된 클라이언트)
            //.authorizedGrantTypes("password", "refresh_token")
            .authorizedGrantTypes("password", "refresh_token")
            // 권한 롤
            .authorities("ROLE_MEMBER")
            .scopes("read", "write", "trust")
            .resourceIds(applicationProperty.getProperty("oauth.resourceId"))
            //.secret(applicationProperty.getProperty("oauth.clientSecret"))
            .and()
          .withClient(applicationProperty.getProperty("oauth.credentailsClientId"))
            // 보증된 클라이언트에게 임시 토큰을 발급한다.
            .authorizedGrantTypes("client_credentials")
            .authorities("ROLE_CREDENTIALS_CLIENT")
            .scopes("read")
            .resourceIds(applicationProperty.getProperty("oauth.resourceId"))
            .secret(applicationProperty.getProperty("oauth.clientSecret"))
            .and()
      ;
      // @formatter:on
      
      // 이거 없으면 서버 재시작 후 토큰 발급시 oauth_client_details 테이블에서 duplicate 에러가 발생한다.
      clients.withClientDetails(new JdbcClientDetailsService(dataSource));
      
      /*
      // @formatter:off
      clients
        .inMemory()
          .withClient(applicationProperty.getProperty("oauth.clientId"))
            // 권한 부여 방식(비밀번호 인증, 리프레시 토큰)
            .authorizedGrantTypes("password", "refresh_token")
            // 권한 롤
            .authorities("USER")
            .scopes("read", "write")
            .resourceIds(RESOURCE_ID)
            .secret(applicationProperty.getProperty("oauth.clientSecret"));
      // @formatter:on
      */
    }
    
    @Bean
    @Primary
    public DefaultTokenServices tokenServices() {
      DefaultTokenServices tokenServices = new DefaultTokenServices();
      tokenServices.setSupportRefreshToken(true);
      tokenServices.setTokenStore(tokenStore());
      tokenServices.setTokenEnhancer(tokenEnhancer());
      return tokenServices;
    }
    
    @Bean
    public TokenStore tokenStore() {
      return new JdbcTokenStore(dataSource);
    }
    
    @Bean
    public TokenEnhancer tokenEnhancer() {
      return new ComeitTokenEnhancer();
    }
  }
}
