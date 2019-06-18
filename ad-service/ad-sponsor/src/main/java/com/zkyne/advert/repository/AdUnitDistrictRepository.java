package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdUnitDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AdUnitDistrictRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:01
 */
@Repository
public interface AdUnitDistrictRepository extends JpaRepository<AdUnitDistrict, Long> {

}
