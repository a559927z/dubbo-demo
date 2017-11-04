package yjmyzz.dubbo.demo.provider;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class DemoProvider {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:*.xml");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}