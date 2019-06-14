package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: CommonResponse
 * @Description: 统一 返回值格式
 * @Author: zkyne
 * @Date: 2019/6/14 9:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = -7497660833637796703L;

    private Integer code;
    private String message;
    private T data;

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
