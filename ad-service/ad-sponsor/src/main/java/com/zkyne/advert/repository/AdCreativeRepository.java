package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdCreative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AdCreativeRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:52
 */
@Repository
public interface AdCreativeRepository extends JpaRepository<AdCreative, Long> {

}
