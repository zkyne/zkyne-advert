package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdvertUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: AdvertUnitRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:56
 */
public interface AdvertUnitRepository extends JpaRepository<AdvertUnit, Long> {

    /**
     * @param planId
     * @param unitName
     * @return
     */
    AdvertUnit findByPlanIdAndUnitName(Long planId, String unitName);

    /**
     * @param unitStatus
     * @return
     */
    List<AdvertUnit> findAllByUnitStatus(Integer unitStatus);

}
