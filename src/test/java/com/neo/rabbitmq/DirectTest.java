package com.neo.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.rabbit.direct.DirectSender;
import com.neo.rabbit.fanout.FanoutSender;

/**
  *@deprecated:
  *@author作者：mp
  *2019年5月31日
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectTest {
	/**
	  *@deprecated:
	  *@author作者：mp
	  *2019年5月31日
	*/
	@Autowired
	private DirectSender sender;
	@Test
	public void test() throws Exception {
			sender.directSend();
	}
}
