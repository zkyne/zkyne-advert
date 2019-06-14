package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdvertUnitKeyword
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertUnitKeyword {
    private Long id;
    private Long unitId;
    private String keyword;

    private Date createTime;
    private Date modifyTime;

}
