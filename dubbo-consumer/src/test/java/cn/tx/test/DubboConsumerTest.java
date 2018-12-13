package cn.tx.test;

import com.kakacl.service.HelloService;
import com.kakacl.service.SubsidyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dubbo-consumer.xml"})
public class DubboConsumerTest {

    @Autowired
    HelloService helloService;
    //GenericService helloService;

    @Autowired
    private SubsidyService subsidyService;

    @Test
    public void startService() throws IOException, InterruptedException {
        String sayHello = helloService.sayHello("test");
                //(String) helloService.$invoke("sayHello", new String[]{"java.lang.String"}, new Object[]{"nihao"});
        System.out.println(sayHello);

        subsidyService.endDateCalculate(10);

    }

}
