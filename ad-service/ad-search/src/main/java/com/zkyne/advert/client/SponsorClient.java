package com.zkyne.advert.client;

import com.zkyne.advert.client.vo.AdPlan;
import com.zkyne.advert.client.vo.AdPlanRequest;
import com.zkyne.advert.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName: SponsorClient
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/24 10:27
 */
@FeignClient(value = "ad-sponsor",fallback = SponsorClientHystrix.class)
public interface SponsorClient {

    /**
     * 通过planIds和userId 查询推广计划列表
     * @param request
     * @return
     */
    @RequestMapping(value = "/ad-sponsor/v1/plans", method = RequestMethod.GET)
    CommonResponse<List<AdPlan>> getAdPlanByIds(@RequestBody AdPlanRequest request);
}
