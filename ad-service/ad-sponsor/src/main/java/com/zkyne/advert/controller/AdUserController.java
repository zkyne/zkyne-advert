package com.zkyne.advert.controller;

import com.alibaba.fastjson.JSON;
import com.zkyne.advert.entity.AdUser;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.service.IAdUserService;
import com.zkyne.advert.vo.AdUserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: AdUserController
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/20 14:13
 */
@Slf4j
@RestController
@RequestMapping("users")
public class AdUserController {

    @Resource
    private IAdUserService adUserService;

    @PostMapping("")
    public AdUser createAdUser(@RequestBody AdUserRequest request) throws AdvertException {
        log.info("ad-sponsor: createAdUser -> {}", JSON.toJSONString(request));
        return adUserService.createUser(request);
    }
}
