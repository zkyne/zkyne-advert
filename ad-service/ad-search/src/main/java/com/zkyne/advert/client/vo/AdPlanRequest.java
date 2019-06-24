package com.zkyne.advert.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdPlanRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 10:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanRequest {
    private Long userId;
    private List<Long> planIds;
}
