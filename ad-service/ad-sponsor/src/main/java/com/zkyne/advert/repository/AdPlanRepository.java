package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: AdPlanRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:57
 */
@Repository
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    /**
     * @param planIds
     * @param userId
     * @return
     */
    AdPlan findByPlanIdAndUserId(Long planIds, Long userId);

    /**
     * @param planIds
     * @param userId
     * @return
     */
    List<AdPlan> findAllByPlanIdInAndUserId(List<Long> planIds, Long userId);

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
