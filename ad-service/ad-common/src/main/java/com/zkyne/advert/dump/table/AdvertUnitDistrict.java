package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdvertUnitDistrict
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertUnitDistrict {
    private Long id;
    private Long unitId;
    private String province;
    private String city;

    private Date createTime;
    private Date modifyTime;

}
