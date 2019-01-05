package liuxun.dubbo.begin;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration // 若配置在application.properties中 需要使用此注解
//@DubboComponentScan(basePackages = {"liuxun.dubbo.begin.service"}) // 若没在配置类中中配置dubbo 需要关闭此注解
@SpringBootApplication
public class ProviderApplication {


    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class, args);
    }

}
