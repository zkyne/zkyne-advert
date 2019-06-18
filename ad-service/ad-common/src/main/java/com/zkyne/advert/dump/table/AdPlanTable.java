package com.zkyne.advert.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdPlanTable
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanTable {

    private Long planId;
    private Long userId;
    private Integer planStatus;
    private Date startDate;
    private Date endDate;
}
