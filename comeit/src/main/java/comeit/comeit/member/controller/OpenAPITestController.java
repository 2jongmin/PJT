package comeit.comeit.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import comeit.comeit.member.service.SocialLoginService;
import comeit.framework.common.utils.ApplicationProperty;

@RestController
public class OpenAPITestController {
  protected final Logger log = LoggerFactory.getLogger(OpenAPITestController.class);
  
  @Autowired
  @Qualifier("applicationProperty")
  private ApplicationProperty applicationProperty;

  @Autowired
  private SocialLoginService openApiService;
  
  /**
   * 테스트용 페이스북 accessToken, userId 유효성 체크
   * @param payload
   * @param response
   * @return
   * @throws Exception
   */
  @RequestMapping(value="/test/verifyFacebookAccessToken", method=RequestMethod.POST)
  public String verifyFacebookAccessToken(@RequestBody String payload) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jp = factory.createParser(payload);
    JsonNode rootNode = mapper.readTree(jp);
    
    log.debug("json body : {}", rootNode);
    
    String accessToken = rootNode.path("accessToken").asText();
    String userId = rootNode.path("userId").asText();
    
    //String result = openApiService.verifyFacebookAccessToken(accessToken, userId);
    
    
    return "";
  }
}
