package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AdUnitTable
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitTable {

    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;
    private Long planId;

}
