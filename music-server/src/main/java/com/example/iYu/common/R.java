package com.example.iYu.common;

import lombok.Data;

/**
* @Description:  返回前端封装的结果类
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/3/6
*/
@Data
public class R {

    private int code;

    private String message;

    private String type;

    private Boolean success;

    private Object data;

    public static R success(String message) {
        R r = new R();
        r.setCode(200);
        r.setMessage(message);
        r.setSuccess(true);
        r.setType("success");
        r.setData(null);
        return r;
    }

    public static R success(String message, Object data) {
        R r = success(message);
        r.setData(data);
        return r;
    }

    public static R warning(String message) {
        R r = error(message);
        r.setType("warning");
        return r;
    }

    public static R error(String message) {
        R r = success(message);
        r.setSuccess(false);
        r.setType("error");
        return r;
    }

    public static R fatal(String message) {
        R r = error(message);
        r.setCode(500);
        return r;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
