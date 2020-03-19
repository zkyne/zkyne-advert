package com.zkyne.advert.controller;

import com.zkyne.advert.client.SponsorClient;
import com.zkyne.advert.client.vo.AdPlan;
import com.zkyne.advert.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: SearchController
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/24 10:56
 */
@Slf4j
@RestController
@RequestMapping("search")
public class SearchController {
    @Resource
    private SponsorClient sponsorClient;

    @RequestMapping("/plans/{userId}")
    public CommonResponse<List<AdPlan>> getAdPlanByIds(@PathVariable("userId") Long userId, @RequestParam String planIds) {
        return sponsorClient.getAdPlanByIds(userId, planIds);
    }

}
