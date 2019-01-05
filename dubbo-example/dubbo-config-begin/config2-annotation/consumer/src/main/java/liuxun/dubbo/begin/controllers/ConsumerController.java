package liuxun.dubbo.begin.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import liuxun.dubbo.begin.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ConsumerController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    public HelloService helloService;

    @GetMapping("/hello")
    public Object test() {
        final String info = helloService.
                sayHello("现在时间是: " +
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:sss")
                                .format(new Date()));
        return info;
    }
}
