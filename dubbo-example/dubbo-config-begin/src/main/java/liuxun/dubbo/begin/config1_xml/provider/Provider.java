package liuxun.dubbo.begin.config1_xml.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:liuxun/dubbo/begin/config1_xml/provider/provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
