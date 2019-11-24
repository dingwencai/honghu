package com.honghu.vo;

public class HttpResultVo {
    private int code = 20000;
    private String msg;
    private Object data;

    public HttpResultVo() {
    }

    public static HttpResultVo error() {
        return error(50000, "未知异常，请联系管理员");
    }

    public static HttpResultVo error(String msg) {
        return error(50000, msg);
    }

    public static HttpResultVo error(int code, String msg) {
        HttpResultVo r = new HttpResultVo();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static HttpResultVo ok(String msg) {
        HttpResultVo r = new HttpResultVo();
        r.setMsg(msg);
        return r;
    }

    public static HttpResultVo ok(Object data) {
        HttpResultVo r = new HttpResultVo();
        r.setData(data);
        r.setMsg("success");
        return r;
    }

    public static HttpResultVo ok() {
        return new HttpResultVo();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
