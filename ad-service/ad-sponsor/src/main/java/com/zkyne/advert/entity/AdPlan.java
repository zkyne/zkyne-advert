package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.zkyne.advert.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Entity
@Table(name = "ad_plan")
public class AdPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id", nullable = false)
    @JSONField(name = "plan_id")
    private Long planId;

    @Basic
    @Column(name = "user_id", nullable = false)
    @JSONField(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "plan_name", nullable = false)
    @JSONField(name = "plan_name")
    private String planName;

    @Basic
    @Column(name = "plan_status", nullable = false)
    @JSONField(name = "plan_status")
    private Integer planStatus;

    @Basic
    @Column(name = "start_date", nullable = false)
    @JSONField(name = "start_date")
    private Date startDate;

    @Basic
    @Column(name = "end_date", nullable = false)
    @JSONField(name = "end_date")
    private Date endDate;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;

    public AdPlan(Long userId, String planName, Date startDate, Date endDate) {

        this.userId = userId;
        this.planName = planName;
        this.planStatus = CommonStatus.VALID.getStatus();
        this.startDate = startDate;
        this.endDate = endDate;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }

}
