package liuxun.dubbo.begin.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception{
//        System.out.println(Provider.class.getResource("").getPath()+"provider.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:liuxun/dubbo/begin/provider/provider.xml");

        context.start();
        System.in.read(); // 按任意键退出
    }
}
