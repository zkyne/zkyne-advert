package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdUnitKeyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AdUnitKeywordRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:01
 */
@Repository
public interface AdUnitKeywordRepository extends JpaRepository<AdUnitKeyword, Long> {

}
