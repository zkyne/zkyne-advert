package com.zkyne.advert.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdvertCreative
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertCreative {

    private Long advertId;
    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Integer auditStatus;
    private String adUrl;

    private Date createTime;
    private Date modifyTime;
}
