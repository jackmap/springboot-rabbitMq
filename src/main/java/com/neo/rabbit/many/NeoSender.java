package com.neo.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NeoSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	/**
	 * @Description 用处： 一个队列对两个接收者 一个接奇数 另一个接o数

	 * @author作者：mp
	 * @date   2019年5月31日
	 * @param i
	 */
	public void send(int i) {
		String context = "spirng boot neo queue  一个队列对应多个接收者 "+" ****** "+i;
		System.out.println("Sender1 : " + context);
		this.rabbitTemplate.convertAndSend("neo", context);
	}

}