package com.zkyne.advert.service.impl;

import com.zkyne.advert.constant.CommonStatus;
import com.zkyne.advert.constant.Constants;
import com.zkyne.advert.entity.AdPlan;
import com.zkyne.advert.entity.AdUser;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.repository.AdPlanRepository;
import com.zkyne.advert.repository.AdUserRepository;
import com.zkyne.advert.service.IAdPlanService;
import com.zkyne.advert.utils.CommonUtils;
import com.zkyne.advert.vo.AdPlanRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName: AdPlanServiceImpl
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 16:18
 */
@Service
public class AdPlanServiceImpl implements IAdPlanService {

    @Resource
    private AdPlanRepository adPlanRepository;
    @Resource
    private AdUserRepository adUserRepository;

    @Override
    public AdPlan createAdPlan(AdPlanRequest request) throws AdvertException {
        if (!request.createValidate()) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Optional<AdUser> userOptional = adUserRepository.findById(request.getUserId());
        if (!userOptional.isPresent()) {
            throw new AdvertException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }
        AdPlan existPlan = adPlanRepository.findByUserIdAndPlanName(request.getUserId(), request.getPlanName());
        if (existPlan != null) {
            throw new AdvertException(Constants.ErrorMsg.SAME_NAME_PLAN_ERROR);
        }
        return adPlanRepository.save(new AdPlan(request.getUserId(), request.getPlanName(), CommonUtils.parseStringDate(request.getStartDate()), CommonUtils.parseStringDate(request.getEndDate())));
    }

    @Override
    public AdPlan updateAdPlan(AdPlanRequest request) throws AdvertException {
        if (!request.updateValidate()) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdPlan existPlan = adPlanRepository.findByPlanIdAndUserId(request.getPlanId(), request.getUserId());
        if (existPlan == null) {
            throw new AdvertException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }
        if (request.getPlanName() != null) {
            existPlan.setPlanName(request.getPlanName());
        }
        if (request.getStartDate() != null) {
            existPlan.setStartDate(CommonUtils.parseStringDate(request.getStartDate()));
        }
        if (request.getEndDate() != null) {
            existPlan.setEndDate(CommonUtils.parseStringDate(request.getEndDate()));
        }
        existPlan.setModifyTime(new Date());
        return adPlanRepository.saveAndFlush(existPlan);
    }

    @Override
    public void deleteAdPlan(AdPlanRequest request) throws AdvertException {
        if (!request.deleteValidate()) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdPlan existPlan = adPlanRepository.findByPlanIdAndUserId(request.getPlanId(), request.getUserId());
        if (existPlan == null) {
            throw new AdvertException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }

        existPlan.setPlanStatus(CommonStatus.INVALID.getStatus());
        existPlan.setModifyTime(new Date());
        adPlanRepository.saveAndFlush(existPlan);
    }

    @Override
    public List<AdPlan> getAdPlanByIds(AdPlanRequest request) throws AdvertException {
        if (!request.queryValidate()) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        return adPlanRepository.findAllByPlanIdInAndUserId(request.getPlanIds(), request.getUserId());
    }
}
