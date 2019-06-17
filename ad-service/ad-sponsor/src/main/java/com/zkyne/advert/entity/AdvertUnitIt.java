package com.zkyne.advert.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdvertUnitIt
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "advert_unit_it")
public class AdvertUnitIt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    @Basic
    @Column(name = "it_tag", nullable = false)
    private String itTag;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    private Date modifyTime;

    public AdvertUnitIt(Long unitId, String itTag) {
        this.unitId = unitId;
        this.itTag = itTag;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }
}
