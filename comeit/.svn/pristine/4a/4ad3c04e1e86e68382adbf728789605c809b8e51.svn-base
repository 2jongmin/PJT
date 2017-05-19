package comeit.comeit.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
  protected final Logger log = LoggerFactory.getLogger(LoginController.class);
  
  @RequestMapping(value="/admin/forwardLoginForm.do")
  public String loginForm() throws Exception {
    return "admin/login/loginForm";
  }
  
  @RequestMapping(value="/rest/login")
  @ResponseBody
  public String restLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
    log.debug("restLogin~~~~~~~~~~~~~~");
    return "ok";
  }
}
