package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AdvertCreativeTable
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertCreativeTable {

    private Long advertId;
    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Integer auditStatus;
    private String advertUrl;
}
