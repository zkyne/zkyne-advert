package com.zkyne.advert.client;

import com.zkyne.advert.client.vo.AdPlan;
import com.zkyne.advert.client.vo.AdPlanRequest;
import com.zkyne.advert.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: SponsorClientHystrix
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/24 10:28
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlanByIds(AdPlanRequest request) {
        return new CommonResponse<>(-1, "ad-sponsor error");
    }
}
