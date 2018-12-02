package com.tiny.crystal.model;

import lombok.Data;
/**
* @author tiny lin
* @date 2018/12/2
**/
@Data
public class RestfulResultData extends RestfulResult {
    private Object data;

    public RestfulResultData(Integer code, String msg) {
        super(code, msg);
    }

    public RestfulResultData(Integer code, String msg, Object data) {
        super(code, msg);
        this.data = data;
    }

}
