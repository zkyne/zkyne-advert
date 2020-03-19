package com.zkyne.advert.client;

import com.zkyne.advert.client.vo.AdPlan;
import com.zkyne.advert.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName: SponsorClient
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/24 10:27
 */
@FeignClient(value = "AD-SPONSOR",fallback = SponsorClientHystrix.class)
public interface SponsorClient {

    /**
     * 通过planIds和userId 查询推广计划列表
     * @param userId
     * @param planIds
     * @return
     */
    @RequestMapping(value = "/ad-sponsor/v1/plans/{userId}", method = RequestMethod.GET)
    CommonResponse<List<AdPlan>> getAdPlanByIds(@PathVariable("userId") Long userId, @RequestParam("planIds") String planIds);
}
