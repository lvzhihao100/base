package com.gamerole.base.core.ret;

public class HttpResponse {

    private final static String SUCCESS = "success";

    public static <T> HttpResult<T> makeOKRsp() {
        return new HttpResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> HttpResult<T> makeOKRsp(T data) {
        return new HttpResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> HttpResult<T> makeErrRsp(String message) {
        return new HttpResult<T>().setCode(RetCode.FAIL).setMsg(SUCCESS);
    }

    public static <T> HttpResult<T> makeRsp(int code, String msg) {
        return new HttpResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> HttpResult<T> makeRsp(int code, String msg, T data) {
        return new HttpResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
