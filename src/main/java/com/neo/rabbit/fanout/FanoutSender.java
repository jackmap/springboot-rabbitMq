package com.neo.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	/**
	 * @Description 用处： Fanout Exchange 不处理路由键。 
	 * 你只需要简单的将队列绑定到交换机上。
	 * 一个发送到交换机的消息都会被转发到与该交换机绑定的所有队列上。
	 *  很像子网广播，每台子网内的主机都获得了一份复制的消息。
	 * Fanout交换机转发消息是最快的。
	 * @author作者：mp
	 * @date 2019年5月31日
	 */
	public void send() {
		String context = "hi, fanout msg  分散消息";
		// System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("fanoutExchange", "", context);
	}

}