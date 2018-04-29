package com.origen.dubbo.provider.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/4/29 14:38
 */
public class ProviderStarter {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("provider is start success");
        System.in.read();
    }
}
