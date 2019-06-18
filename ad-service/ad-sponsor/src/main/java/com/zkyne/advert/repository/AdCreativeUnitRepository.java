package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdCreativeUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AdCreativeUnitRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:53
 */
@Repository
public interface AdCreativeUnitRepository extends JpaRepository<AdCreativeUnit, Long> {

}
