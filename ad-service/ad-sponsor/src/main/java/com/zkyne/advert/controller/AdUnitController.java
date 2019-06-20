package com.zkyne.advert.controller;

import com.alibaba.fastjson.JSON;
import com.zkyne.advert.entity.*;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.service.IAdUnitService;
import com.zkyne.advert.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: AdUnitController
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/20 17:36
 */
@Slf4j
@RestController
@RequestMapping("units")
public class AdUnitController {

    @Resource
    private IAdUnitService adUnitService;

    @PostMapping("")
    public AdUnit createAdUnit(@RequestBody AdUnitRequest request) throws AdvertException {
        log.info("ad-sponsor: createAdUnit -> {}", JSON.toJSONString(request));
        return adUnitService.createUnit(request);
    }

    @PostMapping("/creatives")
    public List<AdCreativeUnit> createCreativeUnit(@RequestBody AdCreativeUnitRequest request) throws AdvertException {
        log.info("ad-sponsor: createCreativeUnit -> {}", JSON.toJSONString(request));
        return adUnitService.createCreativeUnit(request);
    }

    @PostMapping("/districts")
    public List<AdUnitDistrict> createUnitDistrict(@RequestBody AdUnitDistrictRequest request) throws AdvertException {
        log.info("ad-sponsor: createUnitDistrict -> {}", JSON.toJSONString(request));
        return adUnitService.createUnitDistrict(request);
    }

    @PostMapping("/interests")
    public List<AdUnitInterest> createUnitInterest(@RequestBody AdUnitInterestRequest request) throws AdvertException {
        log.info("ad-sponsor: createUnitInterest -> {}", JSON.toJSONString(request));
        return adUnitService.createUnitInterest(request);
    }

    @PostMapping("/keywords")
    public List<AdUnitKeyword> createUnitKeyword(@RequestBody AdUnitKeywordRequest request) throws AdvertException {
        log.info("ad-sponsor: createUnitKeyword -> {}", JSON.toJSONString(request));
        return adUnitService.createUnitKeyword(request);
    }

}
