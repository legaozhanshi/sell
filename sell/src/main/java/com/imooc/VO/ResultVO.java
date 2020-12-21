package com.imooc.VO;

/**
 * http请求返回的最外层对象
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/21 21:13
 */
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 具体内容
     */
    private T data;
}
