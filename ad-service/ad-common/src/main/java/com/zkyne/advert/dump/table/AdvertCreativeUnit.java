package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class AdvertCreativeUnit {
    private Long id;
    private Long advertId;
    private Long unitId;

    private Date createTime;
    private Date modifyTime;
}
