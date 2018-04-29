package com.origen.dubbo.provider.service;

import com.origen.dubbo.api.model.Request;
import com.origen.dubbo.api.model.Response;
import com.origen.dubbo.api.service.IDubboService;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/4/29 14:15
 */
public class DubboServiceImpl implements IDubboService{
    public Response getResponse(Request request) {
        System.out.println(request);
        Response response = new Response();
        response.setCode("200");
        response.setMsg("响应成功");
        return response;
    }
}
