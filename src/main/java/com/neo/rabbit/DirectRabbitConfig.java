package com.neo.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.BindingBuilder.DirectExchangeRoutingKeyConfigurer;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :mp direct（直连） 直连模式 一对一的绑定关系， Routing key(路由关键字)和Binding
 *         key只有完全匹配，才能消费成功。
 */
@Configuration
public class DirectRabbitConfig {

	@Bean
	public Queue directQueue() {
		return new Queue("directQueue");
	}


	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange("directExchange");
	}

	@Bean
	public Binding bindQueue1() {
		return BindingBuilder.bind(directQueue()).to(directExchange()).with("directRoutingKey");
	}

	

}
