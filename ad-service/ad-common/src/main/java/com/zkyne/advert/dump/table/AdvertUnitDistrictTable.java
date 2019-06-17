package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AdvertUnitDistrictTable
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertUnitDistrictTable {

    private Long unitId;
    private String province;
    private String city;

}
