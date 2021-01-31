package com.dzj.demo.framework.base;

import java.util.HashMap;

/**
 * @author xiaojie
 * @Description 返回结果
 * @createTime 2021-01-31 21:44
 **/
public class AjaxResult{
    /**状态码*/
    private int code;
    /**提示信息*/
    private String msg;
    /**返回数据*/
    private Object data;


    public AjaxResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public AjaxResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 请求成功，默认消息
     * @param data 返回数据
     * @return 返回信息
     */
    public static AjaxResult success(Object data){

        return new AjaxResult(0, "请求成功",data);
    }

    /**
     * 请求失败，默认消息
     * @return 结果集
     */
    public static AjaxResult error(){
        return new AjaxResult(500,"请求失败");
    }

    /**
     * 请求失败，自定义消息
     * @param msg 消息
     * @return 结果集
     */
    public static AjaxResult error(String msg){
        return new AjaxResult(500,msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
