package comeit.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comeit.test.service.TestService;

@RestController
public class RestTestController {
  @Resource
  private TestService testService;
  
  @RequestMapping(value="/test/insert")
  public Map<String, String> insert() throws Exception {
    testService.insert();
    
    Map<String, String> result = new HashMap<String, String>();
    result.put("resultCode", "OK");
    result.put("resultMessage", "성공했습니다.");
    
    return result;
  }
  
  @RequestMapping(value="/test/select")
  public Map<String, String> select() throws Exception {
    testService.select("aaaaaaaa");
    
    Map<String, String> result = new HashMap<String, String>();
    result.put("resultCode", "OK");
    result.put("resultMessage", "성공했습니다.");
    
    return result;
  }
}
