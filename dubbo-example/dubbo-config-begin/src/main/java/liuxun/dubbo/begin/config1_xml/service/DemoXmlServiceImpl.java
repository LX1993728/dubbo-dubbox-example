package liuxun.dubbo.begin.config1_xml.service;

public class DemoXmlServiceImpl implements DemoXmlService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
