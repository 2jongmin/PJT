package comeit.framework.configure.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import comeit.framework.configure.spring.security.provider.ComeitAuthenticationProvider;

/**
 * 스프링 시큐리티를 활성화 한다.
 * OAuth 2.0을 사용해도 본 클래스는 반드시 필요하다.
 * 접근에 대한 관리는 OAuth2ServerConfiguration 클래스에서 담당한다.
 * @author linuxp
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
  //@Autowired
  //private ComeitUserDetailsService userDetailsService;
  
  @Autowired
  private ComeitAuthenticationProvider authenticationProvider;
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //auth.userDetailsService(userDetailsService);
    auth.authenticationProvider(authenticationProvider);
  }
  
  @Override
  @Bean
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }
}
