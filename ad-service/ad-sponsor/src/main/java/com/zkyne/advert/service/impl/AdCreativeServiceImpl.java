package com.zkyne.advert.service.impl;

import com.zkyne.advert.entity.AdCreative;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.repository.AdCreativeRepository;
import com.zkyne.advert.service.IAdCreativeService;
import com.zkyne.advert.vo.AdCreativeRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: AdCreativeServiceImpl
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 10:38
 */
@Service
public class AdCreativeServiceImpl implements IAdCreativeService {

    @Resource
    private AdCreativeRepository adCreativeRepository;


    @Override
    public AdCreative createCreative(AdCreativeRequest request) throws AdvertException {
        return adCreativeRepository.save(request.convertToEntity());
    }
}
