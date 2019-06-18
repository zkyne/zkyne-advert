package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: AdvertUnitRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:56
 */
public interface AdvertUnitRepository extends JpaRepository<AdUnit, Long> {

    /**
     * @param planId
     * @param unitName
     * @return
     */
    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    /**
     * @param unitStatus
     * @return
     */
    List<AdUnit> findAllByUnitStatus(Integer unitStatus);

}
