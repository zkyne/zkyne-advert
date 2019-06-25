package com.zkyne.advert.client.vo;

import com.alibaba.fastjson.annotation.JSONField;
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
    @JSONField(name = "plan_id")
    private Long planId;
    @JSONField(name = "user_id")
    private Long userId;
    @JSONField(name = "plan_name")
    private String planName;
    @JSONField(name = "plan_status")
    private Integer planStatus;
    @JSONField(name = "start_date")
    private Date startDate;
    @JSONField(name = "end_date")
    private Date endDate;
    @JSONField(name = "create_time")
    private Date createTime;
    @JSONField(name = "modify_time")
    private Date modifyTime;
}
