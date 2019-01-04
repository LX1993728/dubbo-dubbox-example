package liuxun.dubbo.begin.service;

public class DemoXmlServiceImpl implements DemoXmlService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
