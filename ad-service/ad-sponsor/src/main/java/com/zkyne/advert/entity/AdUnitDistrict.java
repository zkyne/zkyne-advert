package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdUnitDistrict
 * @Description: 推广单元的地域限制
 * @Author: zkyne
 * @Date: 2019/6/14 11:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_district")
public class AdUnitDistrict {

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
    @Column(name = "province", nullable = false)
    @JSONField(name = "province")
    private String province;

    @Basic
    @Column(name = "city", nullable = false)
    @JSONField(name = "city")
    private String city;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;

    public AdUnitDistrict(Long unitId, String province, String city) {
        this.unitId = unitId;
        this.province = province;
        this.city = city;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }

}
