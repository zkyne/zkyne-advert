package com.zkyne.advert.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.collect.Lists;
import org.springframework.http.MediaType;

import java.util.List;

/**
 * @ClassName: FastJsonConverter
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/25 16:45
 */
public class FastJsonConverter {

    private FastJsonConverter(){}

    private static class HttpMessageConverterInstance {
        private static FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        static {
            FastJsonConfig fastJsonConfig = fastJsonHttpMessageConverter.getFastJsonConfig();
            List<MediaType> fastMediaTypes = Lists.newArrayList();
            fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
            fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty);
            fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
            fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        }
    }

    public static FastJsonHttpMessageConverter newInstance(){
        return HttpMessageConverterInstance.fastJsonHttpMessageConverter;
    }
}
