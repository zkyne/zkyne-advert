package com.zkyne.advert.service;

import com.zkyne.advert.entity.AdPlan;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.vo.AdPlanRequest;

import java.util.List;

/**
 * @ClassName: IAdPlanService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:19
 */
public interface IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    AdPlan createAdPlan(AdPlanRequest request) throws AdvertException;

    /**
     * <h2>更新推广计划</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    AdPlan updateAdPlan(AdPlanRequest request) throws AdvertException;

    /**
     * <h2>删除推广计划</h2>
     *
     * @param request
     * @throws AdvertException
     */
    void deleteAdPlan(AdPlanRequest request) throws AdvertException;

    /**
     * <h2>获取推广计划</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    List<AdPlan> getAdPlanByIds(AdPlanRequest request) throws AdvertException;

}
