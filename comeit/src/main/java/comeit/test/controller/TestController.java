package comeit.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import comeit.test.service.TestService;

@Controller
public class TestController {
  @Resource
  private TestService testService;
  
  @RequestMapping(value="/test.do")
  public String forwardTest(Model model) {
    return "index";
  }
  
  @RequestMapping(value="/websockettest.do")
  public String forwardWebSocketTest() {
    return "websockettest";
  }
  
  /**
   * 템플릿 화면으로 이동
   * @param fileName
   * @return
   */
  @RequestMapping(value="/admin/template/{directoryName}/{fileName}")
  public String forwardTemplatePage(@PathVariable(value="directoryName") String directoryName, @PathVariable(value="fileName") String fileName) {
    return "admin/template/" + directoryName + "/" + fileName;
  }
  
  @RequestMapping(value="/dataListTemplate")
  public String forwardDataListTemplateForTiles() {
    return "dataListTemplate";
  }
  
  @RequestMapping(value="/sitemeshTestPage.do")
  public String forwardSitemeshTestPage() {
    return "/admin/common/sitemesh/home";
  }
}
