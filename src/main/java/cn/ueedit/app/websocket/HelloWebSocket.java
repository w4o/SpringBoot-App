package cn.ueedit.app.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by Frank on 2017/4/12.
 */
@ServerEndpoint(value = "/socket")
@Component
public class HelloWebSocket {

    @OnOpen
    public void onOpen(Session session) {

    }

    @OnClose
    public void onClose(Session session) {

    }

    @OnMessage
    public void onMessage(String message, Session session){

    }



}
