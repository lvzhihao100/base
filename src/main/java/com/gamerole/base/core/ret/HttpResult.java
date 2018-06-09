package com.gamerole.base.core.ret;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "整体返回格式")
public class HttpResult<T> {
    @ApiModelProperty(value = "返回码，0成功")
    public int code;
    @ApiModelProperty(value = "提示信息")
    private String msg;
    @ApiModelProperty(value = "真正要用的数据，可以数组可以单个对象")
    private T data;

    public HttpResult<T> setCode(RetCode retCode) {
        this.code = retCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public HttpResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public HttpResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public HttpResult<T> setData(T data) {
        this.data = data;
        return this;
    }

}
