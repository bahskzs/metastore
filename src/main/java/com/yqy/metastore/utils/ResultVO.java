package com.yqy.metastore.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author bahsk
 * @createTime 2021-01-05 0:19
 * @description http请求返回的对象
 */

@Data
public class ResultVO<T> implements Serializable {

    /** 错误码 */
    private Integer code;

    /** 错误信息 */
    private String msg;

    /** 具体内容 */
    private T data;
}
