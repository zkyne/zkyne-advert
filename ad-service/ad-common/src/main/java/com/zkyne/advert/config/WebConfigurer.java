package com.zkyne.advert.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @ClassName: WebConfigurer
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 10:46
 */
@SpringBootConfiguration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        converters.add(FastJsonConverter.newInstance());
    }
}
