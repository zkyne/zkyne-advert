package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdUnitInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AdUnitInterestRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:02
 */
@Repository
public interface AdUnitInterestRepository extends JpaRepository<AdUnitInterest, Long> {

}
