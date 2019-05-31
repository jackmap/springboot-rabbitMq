package com.neo.rabbit.direct;
 
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
 
/**
 * 生产者
 */
@Component
public class DirectSender {
	  /**
     * 自动注入RabbitTemplate模板类
     */
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void directSend(){
        System.out.println("准备开始发送direct模式的消息=======>");
        rabbitTemplate.convertAndSend("directExchange","directRoutingKey","这是一条direct模式发送的消息");
        System.out.println("发送direct模式的消息完毕");
    }
}

