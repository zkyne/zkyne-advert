package com.zkyne.advert.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName: AdvertException
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 9:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdvertException extends Exception {

    private static final long serialVersionUID = 3143927991373927993L;
    private Integer code;
    public AdvertException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public AdvertException(String message) {
        super(message);
        this.code = 500;
    }
}
