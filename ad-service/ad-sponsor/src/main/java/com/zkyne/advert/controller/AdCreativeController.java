package com.zkyne.advert.controller;

import com.alibaba.fastjson.JSON;
import com.zkyne.advert.entity.AdCreative;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.service.IAdCreativeService;
import com.zkyne.advert.vo.AdCreativeRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: AdCreativeController
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/20 15:58
 */
@Slf4j
@RestController
@RequestMapping("creatives")
public class AdCreativeController {

    @Resource
    private IAdCreativeService adCreativeService;

    @PostMapping("")
    public AdCreative createAdCreative(@RequestBody AdCreativeRequest request) throws AdvertException {
        log.info("ad-sponsor: createAdCreative -> {}", JSON.toJSONString(request));
        return adCreativeService.createCreative(request);
    }

}
