package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: AdPlanRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:57
 */
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    /**
     * @param id
     * @param userId
     * @return
     */
    AdPlan findByPlanIdAndUserId(Long id, Long userId);

    /**
     * @param ids
     * @param userId
     * @return
     */
    List<AdPlan> findAllByPlanIdInAndUserId(List<Long> ids, Long userId);

    /**
     * @param userId
     * @param planName
     * @return
     */
    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    /**
     * @param status
     * @return
     */
    List<AdPlan> findAllByPlanStatus(Integer status);
}
