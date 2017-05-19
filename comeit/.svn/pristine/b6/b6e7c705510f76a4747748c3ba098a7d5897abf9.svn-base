package comeit.framework.security.enhancer;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

/**
 * 스프링 OAuth 2.0 에서 인증정보외에 추가적인 정보를 클라이언트로 전달하기 위한 클래스
 * @author linuxp
 *
 */
public class ComeitTokenEnhancer implements TokenEnhancer {
  private List<TokenEnhancer> delegates = Collections.emptyList();
  
  public void setTokenEnhancers(List<TokenEnhancer> delegetes) {
    this.delegates = delegetes;
  }

  @Override
  public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
    DefaultOAuth2AccessToken tempResult = (DefaultOAuth2AccessToken) accessToken;

    final Map<String, Object> additionalInformation = new HashMap<String, Object>();
    final String infoValue = "This is my value!!!!!"; 

    additionalInformation.put("myInfo", infoValue);
    tempResult.setAdditionalInformation(additionalInformation);

    OAuth2AccessToken result = tempResult;
    for (TokenEnhancer enhancer : delegates) {
      result = enhancer.enhance(result, authentication);
    }
    return result;
  }
}
