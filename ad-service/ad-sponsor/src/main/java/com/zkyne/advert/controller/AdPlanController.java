package com.zkyne.advert.controller;

import com.alibaba.fastjson.JSON;
import com.zkyne.advert.entity.AdPlan;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.service.IAdPlanService;
import com.zkyne.advert.vo.AdPlanRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: AdPlanController
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/20 16:57
 */
@Slf4j
@RestController
@RequestMapping("plans")
public class AdPlanController {

    @Resource
    private IAdPlanService adPlanService;

    @PostMapping("")
    public AdPlan createAdPlan(@RequestBody AdPlanRequest request) throws AdvertException {
        log.info("ad-sponsor: createAdPlan -> {}", JSON.toJSONString(request));
        return adPlanService.createAdPlan(request);
    }

    @GetMapping("")
    public List<AdPlan> getAdPlanByIds(@RequestBody AdPlanRequest request) throws AdvertException {
        log.info("ad-sponsor: getAdPlanByIds -> {}", JSON.toJSONString(request));
        return adPlanService.getAdPlanByIds(request);
    }

    @PutMapping("/{planId}")
    public AdPlan modifyAdPlan(@PathVariable("planId")Long planId,@RequestBody AdPlanRequest request) throws AdvertException {
        log.info("ad-sponsor: modifyAdPlan -> planId:{}, {}",planId, JSON.toJSONString(request));
        return adPlanService.modifyAdPlan(request);
    }

    @DeleteMapping("/{planId}")
    public void deleteAdPlan(@PathVariable("planId")Long planId,@RequestBody AdPlanRequest request) throws AdvertException {
        log.info("ad-sponsor: deleteAdPlan -> planId:{}, {}",planId,JSON.toJSONString(request));
        adPlanService.deleteAdPlan(request);
    }
}
