package com.origen.dubbo.api.model;

import sun.print.resources.serviceui_it;

import java.io.Serializable;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/4/29 14:04
 */
public class Request implements Serializable {


    private static final long serialVersionUID = -6070939744642313905L;

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
