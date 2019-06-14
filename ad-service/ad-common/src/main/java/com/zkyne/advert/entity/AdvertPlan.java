package com.zkyne.advert.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdvertPlan
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertPlan {

    private Long planId;
    private Long userId;
    private Integer planStatus;
    private Date beginTime;
    private Date endTime;

    private Date createTime;
    private Date modifyTime;

}
