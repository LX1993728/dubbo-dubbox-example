package liuxun.dubbo.begin;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDubboConfiguration 若没在application.properties中配置dubbo信息 需屏蔽此注解
@DubboComponentScan(basePackages = {"liuxun.dubbo.begin.controllers"}) //在配置类中配置了dubbo相关信息 需开启此注解
@SpringBootApplication
public class ConsumerApplication {


    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication.class, args);
    }

}
