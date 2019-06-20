package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdUnitInterest
 * @Description: 推广单元的兴趣限制
 * @Author: zkyne
 * @Date: 2019/6/14 11:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_interest")
public class AdUnitInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JSONField(name = "id")
    private Long id;

    @Basic
    @Column(name = "unit_id", nullable = false)
    @JSONField(name = "unit_id")
    private Long unitId;

    @Basic
    @Column(name = "it_tag", nullable = false)
    @JSONField(name = "it_tag")
    private String itTag;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;

    public AdUnitInterest(Long unitId, String itTag) {
        this.unitId = unitId;
        this.itTag = itTag;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }
}
