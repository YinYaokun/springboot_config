package com.it.springboot;

import com.it.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {

    @Resource(name = "person")
    Person person;
    @Autowired
    private ApplicationContext context;


    @Test
    public void testHelloService() {
        boolean b = context.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println("--------------------------------------------------");
        System.out.println(person);
    }

}
