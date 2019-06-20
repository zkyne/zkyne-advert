package com.zkyne.advert.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdCreative
 * @Description:  推广创意表
 * @Author: zkyne
 * @Date: 2019/6/14 10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_creative")
public class AdCreative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "creative_id", nullable = false)
    @JSONField(name = "creative_id")
    private Long creativeId;

    @Basic
    @Column(name = "name", nullable = false)
    @JSONField(name = "name")
    private String name;

    @Basic
    @Column(name = "type", nullable = false)
    @JSONField(name = "type")
    private Integer type;

    @Basic
    @Column(name = "material_type", nullable = false)
    @JSONField(name = "material_type")
    private Integer materialType;

    @Basic
    @Column(name = "height", nullable = false)
    @JSONField(name = "height")
    private Integer height;

    @Basic
    @Column(name = "width", nullable = false)
    @JSONField(name = "width")
    private Integer width;

    @Basic
    @Column(name = "size", nullable = false)
    @JSONField(name = "size")
    private Long size;

    @Basic
    @Column(name = "duration", nullable = false)
    @JSONField(name = "duration")
    private Integer duration;

    @Basic
    @Column(name = "audit_status", nullable = false)
    @JSONField(name = "audit_status")
    private Integer auditStatus;

    @Basic
    @Column(name = "user_id", nullable = false)
    @JSONField(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "url", nullable = false)
    @JSONField(name = "url")
    private String url;

    @Basic
    @Column(name = "create_time", nullable = false)
    @JSONField(name = "create_time")
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    @JSONField(name = "modify_time")
    private Date modifyTime;
}
