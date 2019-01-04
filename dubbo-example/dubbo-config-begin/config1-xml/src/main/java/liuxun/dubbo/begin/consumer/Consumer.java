package liuxun.dubbo.begin.consumer;

import liuxun.dubbo.begin.service.DemoXmlService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:liuxun/dubbo/begin/config1_xml/consumer/consumer.xml");
        context.start();
        DemoXmlService demoXmlService = (DemoXmlService) context.getBean("demoXmlService");
        String hello = demoXmlService.sayHello("this is a xml config");
        System.out.println(hello);
    }
}
