package com.zkyne.advert.advice;

import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobalExceptionAdvice
 * @Description: 全局异常处理
 * @Author: zkyne
 * @Date: 2019/6/14 9:47
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handleAdvertException(HttpServletRequest request, Exception e) {
        CommonResponse<String> response;
        if (e instanceof AdvertException) {
            AdvertException aex = (AdvertException) e;
            response = new CommonResponse<>(aex.getCode(), aex.getMessage());
        } else {
            response = new CommonResponse<>(500, "Server error!");
        }
        return response;
    }
}
