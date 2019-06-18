package com.zkyne.advert.service.impl;

import com.zkyne.advert.constant.Constants;
import com.zkyne.advert.entity.AdUser;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.repository.AdUserRepository;
import com.zkyne.advert.service.IAdUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: AdUserServiceImpl
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 10:32
 */
@Service
public class AdUserServiceImpl implements IAdUserService {
    @Resource
    private AdUserRepository adUserRepository;

    @Override
    public AdUser createUser(String username) throws AdvertException {
        if (StringUtils.isBlank(username)) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdUser existUser = adUserRepository.findByUsername(username);
        if (existUser != null) {
            throw new AdvertException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }
        return adUserRepository.save(new AdUser(username));
    }
}
