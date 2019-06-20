package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.zkyne.advert.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdUnit
 * @Description: 推广单元
 * @Author: zkyne
 * @Date: 2019/6/14 11:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit")
public class AdUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id", nullable = false)
    @JSONField(name = "unit_id")
    private Long unitId;

    @Basic
    @Column(name = "plan_id", nullable = false)
    @JSONField(name = "plan_id")
    private Long planId;

    @Basic
    @Column(name = "unit_name", nullable = false)
    @JSONField(name = "unit_name")
    private String unitName;

    @Basic
    @Column(name = "budget", nullable = false)
    @JSONField(name = "budget")
    private Long budget;

    @Basic
    @Column(name = "unit_status", nullable = false)
    @JSONField(name = "unit_status")
    private Integer unitStatus;

    @Basic
    @Column(name = "position_type", nullable = false)
    @JSONField(name = "position_type")
    private Integer positionType;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;

    public AdUnit(Long planId, String unitName, Integer positionType, Long budget) {
        this.planId = planId;
        this.unitName = unitName;
        this.unitStatus = CommonStatus.VALID.getStatus();
        this.positionType = positionType;
        this.budget = budget;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }
}
