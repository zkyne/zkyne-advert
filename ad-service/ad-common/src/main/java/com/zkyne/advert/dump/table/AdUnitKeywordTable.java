package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AdUnitKeywordTable
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitKeywordTable {

    private Long unitId;
    private String keyword;

}
