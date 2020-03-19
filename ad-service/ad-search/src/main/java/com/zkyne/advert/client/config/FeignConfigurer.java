package com.zkyne.advert.client.config;

import com.zkyne.advert.config.FastJsonConverter;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: FeignConfigurer
 * @Description: feign 配置支持fastJson
 * @Author: zkyne
 * @Date: 2019/6/25 15:50
 */
@SpringBootConfiguration
public class FeignConfigurer {

    @Bean
    public Encoder feignEncoder() {
        return new SpringEncoder(feignHttpMessageConverter());
    }

    @Bean
    public Decoder feignDecoder() {
        return new ResponseEntityDecoder(new SpringDecoder(feignHttpMessageConverter()));
    }

    private ObjectFactory<HttpMessageConverters> feignHttpMessageConverter() {
        final HttpMessageConverters httpMessageConverters = new HttpMessageConverters(FastJsonConverter.newInstance());
        return () -> httpMessageConverters;
    }

}
