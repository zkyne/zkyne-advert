package com.zkyne.advert.service;

import com.zkyne.advert.entity.*;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.vo.*;

import java.util.List;

/**
 * @ClassName: IAdUnitService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:19
 */
public interface IAdUnitService {
    /**
     * <h2>新建推广单元</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    AdUnit createUnit(AdUnitRequest request) throws AdvertException;

    /**
     * <h2>新建创意与推广单元关联</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    List<AdCreativeUnit> createCreativeUnit(AdCreativeUnitRequest request) throws AdvertException;

    /**
     * <h2>新建推广单元地域限制</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    List<AdUnitDistrict> createUnitDistrict(AdUnitDistrictRequest request) throws AdvertException;

    /**
     * <h2>新建推广单元兴趣限制</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    List<AdUnitInterest> createUnitInterest(AdUnitInterestRequest request) throws AdvertException;

    /**
     * <h2>新建推广单元关键词限制</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    List<AdUnitKeyword> createUnitKeyword(AdUnitKeywordRequest request) throws AdvertException;

}
