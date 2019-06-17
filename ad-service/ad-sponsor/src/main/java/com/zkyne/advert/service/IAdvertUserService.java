package com.zkyne.advert.service;

import com.zkyne.advert.entity.AdvertUser;
import com.zkyne.advert.exception.AdvertException;

/**
 * @ClassName: IAdvertUserService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:18
 */
public interface IAdvertUserService {

    /**
     * <h2>创建用户</h2>
     * @param username
     * @return
     * @throws AdvertException
     */
    AdvertUser createUser(String username) throws AdvertException;
}
