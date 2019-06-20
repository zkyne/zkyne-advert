package com.zkyne.advert.service;

import com.zkyne.advert.entity.AdUser;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.vo.AdUserRequest;

/**
 * @ClassName: IAdUserService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:18
 */
public interface IAdUserService {

    /**
     * <h2>创建用户</h2>
     * @param request
     * @return
     * @throws AdvertException
     */
    AdUser createUser(AdUserRequest request) throws AdvertException;
}
