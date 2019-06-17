package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdvertPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: AdvertPlanRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:57
 */
public interface AdvertPlanRepository extends JpaRepository<AdvertPlan, Long> {

    /**
     * @param id
     * @param userId
     * @return
     */
    AdvertPlan findByPlanIdAndUserId(Long id, Long userId);

    /**
     * @param ids
     * @param userId
     * @return
     */
    List<AdvertPlan> findAllByPlanIdInAndUserId(List<Long> ids, Long userId);

    /**
     * @param userId
     * @param planName
     * @return
     */
    AdvertPlan findByUserIdAndPlanName(Long userId, String planName);

    /**
     * @param status
     * @return
     */
    List<AdvertPlan> findAllByPlanStatus(Integer status);
}
