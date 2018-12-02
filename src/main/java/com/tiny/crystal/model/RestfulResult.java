package com.tiny.crystal.model;

import lombok.Data;

import java.io.Serializable;

/**
* @author tiny lin
* @date 2018/12/2
**/
@Data
public class RestfulResult implements Serializable {
    private static final long serialVersionUID = -8474378445466770820L;
    private Integer code;
    private String msg;

    public RestfulResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
