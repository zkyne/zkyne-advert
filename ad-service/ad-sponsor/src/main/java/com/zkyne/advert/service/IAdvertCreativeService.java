package com.zkyne.advert.service;

import com.zkyne.advert.entity.AdvertCreative;
import com.zkyne.advert.exception.AdvertException;

/**
 * @ClassName: IAdvertCreativeService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:18
 */
public interface IAdvertCreativeService {

    AdvertCreative createCreative() throws AdvertException;

}
