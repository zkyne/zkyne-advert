package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AdvertUnitKeywordTable
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertUnitKeywordTable {

    private Long unitId;
    private String keyword;

}
