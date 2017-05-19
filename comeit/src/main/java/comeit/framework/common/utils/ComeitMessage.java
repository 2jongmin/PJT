package comeit.framework.common.utils;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.support.MessageSourceAccessor;

public class ComeitMessage {
  @Resource(name="messageSourceAccessor")
  private MessageSourceAccessor messageSourceAccessor;

  public void setMessageSourceAccessor(MessageSourceAccessor msAcc) {
    this.messageSourceAccessor = msAcc;
  }

  public String getMessage(String code) {
    try {
      return messageSourceAccessor.getMessage(code);
    } catch(org.springframework.context.NoSuchMessageException nsme) {
      Locale locale = Locale.KOREAN;
      return messageSourceAccessor.getMessage(code, locale);
    }
  }

  public String getMessage(String code, Locale locale) {
    try {
      return messageSourceAccessor.getMessage(code, locale);
    } catch(org.springframework.context.NoSuchMessageException nsme) {
      nsme.printStackTrace();
      return "";
    }
  }

  public String getMessage(String code, Object[] objs) {
    try {
      return messageSourceAccessor.getMessage(code, objs);
    } catch(org.springframework.context.NoSuchMessageException nsme) {
      nsme.printStackTrace();
      return "";
    }
  }

  public String getMessage(String code, Object[] objs, Locale locale) {
    try {
      return messageSourceAccessor.getMessage(code, objs, locale);
    } catch(org.springframework.context.NoSuchMessageException nsme) {
      nsme.printStackTrace();
      return "";
    }
  }
}
