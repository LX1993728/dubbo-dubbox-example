package liuxun.dubbo.begin.service;

import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
