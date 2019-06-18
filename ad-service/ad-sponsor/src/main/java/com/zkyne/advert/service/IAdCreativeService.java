package com.zkyne.advert.service;

import com.zkyne.advert.entity.AdCreative;
import com.zkyne.advert.exception.AdvertException;

/**
 * @ClassName: IAdCreativeService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:18
 */
public interface IAdCreativeService {

    AdCreative createCreative() throws AdvertException;

}
