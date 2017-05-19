package comeit.framework.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * WEB-INF 디렉토리 하위에 존재하는 jsp 파일에 접근하기 위해서는 본 컨트롤러를 통해 접근해야 한다.
 * @author linuxp
 *
 */
@Controller
public class ForwardCommonViewsController {
  protected final Logger log = LoggerFactory.getLogger(ForwardCommonViewsController.class);
  
  /**
   * 공통 Alert 페이지로 이동
   * @param page
   * @return
   */
  @RequestMapping(value="/common/forwardAlertView.do", method=RequestMethod.GET)
  public String forwardAlertView(Model model, HttpServletRequest request) {
    // 메시지 처리할 에러 코드
    String resultCode = request.getParameter("resultCode");
    // 얼럿 화면에 출력할 오류 메시지
    String resultMessage = request.getParameter("resultMessage");
    // 얼럿창 닫은 후 이동할 페이지 url
    String forwardUrl = request.getParameter("forwardUrl");
    // 결과 타입(성공, 에러)
    String type = request.getParameter("type");
    
    model.addAttribute("resultCode", resultCode);
    model.addAttribute("resultMessage", resultMessage);
    model.addAttribute("forwardUrl", forwardUrl);
    model.addAttribute("type", type);
    
    return "admin/common/alert/alert";
  }
}
