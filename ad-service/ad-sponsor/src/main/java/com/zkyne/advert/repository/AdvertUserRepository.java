package com.zkyne.advert.repository;

import com.zkyne.advert.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: AdvertUserRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 17:54
 */
public interface AdvertUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     *
     * @param username
     * @return
     */
    AdUser findByUsername(String username);
}
