package com.hh.listenter;

import org.apache.activemq.memory.list.MessageList;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 15-11-17.
 */
public class QueueMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
            TextMessage tm = (TextMessage) message;
            try {
                System.out.println("ConsumerMessageListener收到了文本消息：\t"
                        + tm.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
}
