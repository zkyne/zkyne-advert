package com.zkyne.advert.service.impl;

import com.zkyne.advert.constant.Constants;
import com.zkyne.advert.entity.*;
import com.zkyne.advert.exception.AdvertException;
import com.zkyne.advert.repository.*;
import com.zkyne.advert.service.IAdUnitService;
import com.zkyne.advert.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @ClassName: AdUnitServiceImpl
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 17:29
 */
@Service
public class AdUnitServiceImpl implements IAdUnitService {

    @Resource
    private AdCreativeRepository adCreativeRepository;
    @Resource
    private AdPlanRepository adPlanRepository;
    @Resource
    private AdUnitRepository adUnitRepository;
    @Resource
    private AdCreativeUnitRepository adCreativeUnitRepository;
    @Resource
    private AdUnitDistrictRepository adUnitDistrictRepository;
    @Resource
    private AdUnitInterestRepository adUnitInterestRepository;
    @Resource
    private AdUnitKeywordRepository adUnitKeywordRepository;


    @Override
    public AdUnit createUnit(AdUnitRequest request) throws AdvertException {

        if (!request.createValidate()) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        Optional<AdPlan> adPlan = adPlanRepository.findById(request.getPlanId());
        if (!adPlan.isPresent()) {
            throw new AdvertException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }

        AdUnit oldAdUnit = adUnitRepository.findByPlanIdAndUnitName(request.getPlanId(), request.getUnitName());
        if (oldAdUnit != null) {
            throw new AdvertException(Constants.ErrorMsg.SAME_NAME_UNIT_ERROR);
        }

        return adUnitRepository.save(new AdUnit(request.getPlanId(), request.getUnitName(), request.getPositionType(), request.getBudget()));
    }

    @Override
    public List<AdCreativeUnit> createCreativeUnit(AdCreativeUnitRequest request) throws AdvertException {
        List<Long> unitIds = request.getCreativeUnits().stream()
                .map(AdCreativeUnitRequest.CreativeUnit::getUnitId)
                .collect(Collectors.toList());
        List<Long> creativeIds = request.getCreativeUnits().stream()
                .map(AdCreativeUnitRequest.CreativeUnit::getCreativeId)
                .collect(Collectors.toList());

        if (!(isRelatedUnitExist(unitIds) && isRelatedCreativeExist(creativeIds))) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdCreativeUnit> adCreativeUnits = new ArrayList<>();
        request.getCreativeUnits().forEach(creativeUnit -> adCreativeUnits.add(new AdCreativeUnit(creativeUnit.getCreativeId(), creativeUnit.getUnitId())));
        return adCreativeUnitRepository.saveAll(adCreativeUnits);
    }

    @Override
    public List<AdUnitDistrict> createUnitDistrict(AdUnitDistrictRequest request) throws AdvertException {
        List<Long> unitIds = request.getUnitDistricts().stream()
                .map(AdUnitDistrictRequest.UnitDistrict::getUnitId)
                .collect(Collectors.toList());
        if (!isRelatedUnitExist(unitIds)) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdUnitDistrict> adUnitDistricts = new ArrayList<>();
        request.getUnitDistricts().forEach(unitDistrict -> adUnitDistricts.add(new AdUnitDistrict(unitDistrict.getUnitId(), unitDistrict.getProvince(), unitDistrict.getCity())));
        return adUnitDistrictRepository.saveAll(adUnitDistricts);
    }

    @Override
    public List<AdUnitInterest> createUnitInterest(AdUnitInterestRequest request) throws AdvertException {
        List<Long> unitIds = request.getUnitInterests().stream()
                .map(AdUnitInterestRequest.UnitInterest::getUnitId)
                .collect(Collectors.toList());
        if (!isRelatedUnitExist(unitIds)) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdUnitInterest> adUnitInterests = new ArrayList<>();
        request.getUnitInterests().forEach(unitInterest -> adUnitInterests.add(new AdUnitInterest(unitInterest.getUnitId(), unitInterest.getItTag())));
        return adUnitInterestRepository.saveAll(adUnitInterests);
    }

    @Override
    public List<AdUnitKeyword> createUnitKeyword(AdUnitKeywordRequest request) throws AdvertException {
        List<Long> unitIds = request.getUnitKeywords().stream()
                .map(AdUnitKeywordRequest.UnitKeyword::getUnitId)
                .collect(Collectors.toList());
        if (!isRelatedUnitExist(unitIds)) {
            throw new AdvertException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdUnitKeyword> adUnitKeywords = new ArrayList<>();
        request.getUnitKeywords().forEach(unitKeyword -> adUnitKeywords.add(new AdUnitKeyword(unitKeyword.getUnitId(), unitKeyword.getKeyword())));

        return adUnitKeywordRepository.saveAll(adUnitKeywords);
    }

    private boolean isRelatedUnitExist(List<Long> unitIds) {
        if (CollectionUtils.isEmpty(unitIds)) {
            return false;
        }
        return adUnitRepository.findAllById(unitIds).size() == new HashSet<>(unitIds).size();
    }

    private boolean isRelatedCreativeExist(List<Long> creativeIds) {

        if (CollectionUtils.isEmpty(creativeIds)) {
            return false;
        }
        return adCreativeRepository.findAllById(creativeIds).size() == new HashSet<>(creativeIds).size();
    }
}
