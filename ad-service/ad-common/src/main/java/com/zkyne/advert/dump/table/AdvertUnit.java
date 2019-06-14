package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdvertUnit
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertUnit {

    private Long unitId;
    private String unitName;
    private Long budget;
    private Integer unitStatus;
    private Integer positionType;
    private Long planId;

    private Date createTime;
    private Date modifyTime;
}
