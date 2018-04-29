package com.origen.dubbo.api.service;

import com.origen.dubbo.api.model.Request;
import com.origen.dubbo.api.model.Response;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/4/29 14:10
 */
public interface IDubboService {

    public Response getResponse(Request request);
}
