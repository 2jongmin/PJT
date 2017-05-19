package comeit.framework.common.websocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * 웹 소켓 핸들러
 * Tomcat8 이상 + Spring4.0 이상 필요
 * @author linuxp
 *
 */
public class WebSocketHandler extends TextWebSocketHandler {
  /**
   * socket.accept() 후에 onMessage에서 처리될 일들을 이곳에 기술
   */
  @Override
  public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
      String payloadMessage = (String) message.getPayload();
      session.sendMessage(new TextMessage("ECHO : " + payloadMessage));
  }

  /**
   * WebSocket 연결이 발생되었을 때 호출되는 메소드. 연결 되었을때 처리해야 할 일들을 여기에 기술
   */
  @Override
  public void afterConnectionEstablished(WebSocketSession session) throws Exception {
      // Connection이 구성된 후, 호출되는 method
      super.afterConnectionEstablished(session);
  }

  /**
   * WebScket 연결이 끊겼을때 호출되는 메소드.
   */
  @Override
  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
      // Connection이 종료된 후, 호출되는 method
      super.afterConnectionClosed(session, status);
  }
}
