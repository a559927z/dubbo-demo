package com.ks;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainProvider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:dubbo-provider.xml");
		context.start();
		System.out.println("服务已经启动...");
		System.in.read();
	}
}