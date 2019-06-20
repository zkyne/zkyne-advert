package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdUnitKeyword
 * @Description: 推广单元的关键词限制
 * @Author: zkyne
 * @Date: 2019/6/14 11:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_keyword")
public class AdUnitKeyword {

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
    @Column(name = "keyword", nullable = false)
    @JSONField(name = "keyword")
    private String keyword;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;

    public AdUnitKeyword(Long unitId, String keyword) {
        this.unitId = unitId;
        this.keyword = keyword;
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }

}
