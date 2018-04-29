package com.origen.dubbo.consumer.main;

import com.origen.dubbo.api.model.Request;
import com.origen.dubbo.api.model.Response;
import com.origen.dubbo.api.service.IDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/4/29 14:53
 */
public class ConsumerStarter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        IDubboService dubboService = (IDubboService) context.getBean("dubboService");
        Request request = new Request();
        request.setId("001");
        request.setName("请求成功");
        Response response = dubboService.getResponse(request);
        System.out.println(response);
    }
}
