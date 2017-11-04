package com.ks;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import yjmyzz.dubbo.demo.api.UserService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class DemoConsumer {

	public static void main(String[] args) {
		final String port = "8888";

		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:dubbo-config.xml");
		context.start();
		TestService service = context.getBean(TestService.class);
		System.out.println(service.sayHello("zzzz"));
	}

}