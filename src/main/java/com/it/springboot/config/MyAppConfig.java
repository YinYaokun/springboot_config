package com.it.springboot.config;

import com.it.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 尹要坤 on 2018/4/11.
 * @version v1.0
 */

/**
 * @Configuration 指明当前类是一个配置类，就是来替代之前的Spring配置文件
 * <p>
 * 在配置文件中用<bean></bean>标签添加组件，
 */
@Configuration
public class MyAppConfig {

    //将方法的返回 值添加到容器中，容器中这个组件默认的ID就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("组件开始加载。。。。");
        return new HelloService();
    }
}
