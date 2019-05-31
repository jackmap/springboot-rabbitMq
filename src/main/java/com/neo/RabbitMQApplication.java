package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQApplication {

	/**
	 * @Description 用处：
	 * Broker:消息队列服务器实体。
	* Exchange:消息转换机，消息转发通过这个进行，它指定消息按照什么规则，路由到哪个队列。
	* Queue：消息队列载体。
	* Binding:作用是将Exchange和Queue按照路由规则绑定起来，形成某种关系。
	* Routing key:路由关键字，exchange通过这个关键字进行消息投递。
	* vhost:虚拟主机，一个broker可以开设多个vhost，用作不同用户的权限分离。
	* producter:消息生产者，可以投递消息的程序。
	* consumer:消息消费者，接受消息的程序。
	* channel:消息通道，在客户端每个连接里，可建立多个channel，每个channel代表一个会话任务。
	 * @author作者：mp
	 * @date   2019年5月31日
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RabbitMQApplication.class, args);
	}
}
