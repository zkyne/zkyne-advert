package com.zkyne.advert.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdPlan
 * @Description: 推广计划
 * @Author: zkyne
 * @Date: 2019/6/14 11:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlan {

    private Long planId;
    private Long userId;
    private String planName;
    private Integer planStatus;
    private Date startDate;
    private Date endDate;
    private Date createTime;
    private Date modifyTime;
}
