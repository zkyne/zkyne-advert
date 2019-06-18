package com.zkyne.advert.service;

import com.zkyne.advert.entity.AdCreative;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.vo.AdCreativeRequest;

/**
 * @ClassName: IAdCreativeService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:18
 */
public interface IAdCreativeService {
    /**
     * <h2>新建创意</h2>
     *
     * @param request
     * @return
     * @throws AdvertException
     */
    AdCreative createCreative(AdCreativeRequest request) throws AdvertException;

}
