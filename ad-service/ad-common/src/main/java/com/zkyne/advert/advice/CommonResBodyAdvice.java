package com.zkyne.advert.advice;

import com.zkyne.advert.annotation.IgnoreResponseAdvice;
import com.zkyne.advert.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @ClassName: CommonResBodyAdvice
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 10:12
 */
@RestControllerAdvice
public class CommonResBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        if(methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)){
            return false;
        }

        return methodParameter.getMethod() == null || !methodParameter.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        CommonResponse<Object> response = new CommonResponse<>(200,"SUCCESS");
        if(null == o){
            return response;
        }

        if(o instanceof CommonResponse){
            return o;
        }
        response.setData(o);
        return response;
    }
}
