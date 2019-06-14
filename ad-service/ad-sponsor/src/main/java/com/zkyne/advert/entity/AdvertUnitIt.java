package com.zkyne.advert.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class AdvertUnitIt {
    private Long id;
    private Long unitId;
    private String itTag;

    private Date createTime;
    private Date modifyTime;
}
