package com.example.rabbit.direct;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者1
 */
@Component
@RabbitListener(queues = {"directQueue"})
public class DirectReceiver {
  //  该绑定在交换器上的队列，它可以匹配delete,update的路由键,但不是能匹配insert;必须和生产者声明是一模一样；
	    /**
	     * @Description 用处：处理路由键。
	     * 需要将一个队列绑定到交换机上，要求该消息与一个特定的路由键完全匹配。
	     * 这是一个完整的匹配。
	     * 如果一个队列绑定到该交换机上要求路由键 “test”，则只有被标记为“test”的消息才被转发，
	     * 不会转发test.aaa，也不会转发dog.123，只会转发test。 
	     * @author作者：mp
	     * @date   2019年5月31日
	     * @param message
	     */
	    @RabbitHandler
	    public void process(String message) {
	        System.out.println("direct Receiver : " + message);
	    }
}