package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdCreativeUnit
 * @Description: 创意与推广单元关联表
 * @Author: zkyne
 * @Date: 2019/6/14 11:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_creative_unit")
public class AdCreativeUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JSONField(name = "id")
    private Long id;

    @Basic
    @Column(name = "creative_id", nullable = false)
    @JSONField(name = "creative_id")
    private Long creativeId;

    @Basic
    @Column(name = "unit_id", nullable = false)
    @JSONField(name = "unit_id")
    private Long unitId;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;

    public AdCreativeUnit(Long creativeId, Long unitId) {
        this.creativeId = creativeId;
        this.unitId = unitId;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }


}
