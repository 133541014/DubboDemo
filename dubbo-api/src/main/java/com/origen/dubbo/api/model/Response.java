package com.origen.dubbo.api.model;

import java.io.Serializable;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/4/29 14:09
 */
public class Response implements Serializable{
    private static final long serialVersionUID = 1130658137921924046L;

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
