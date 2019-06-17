package com.zkyne.advert.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdvertCreativeUnit
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "advert_creative_unit")
public class AdvertCreativeUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "advert_id", nullable = false)
    private Long advertId;

    @Basic
    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    private Date modifyTime;

    public AdvertCreativeUnit(Long advertId, Long unitId) {
        this.advertId = advertId;
        this.unitId = unitId;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }


}
