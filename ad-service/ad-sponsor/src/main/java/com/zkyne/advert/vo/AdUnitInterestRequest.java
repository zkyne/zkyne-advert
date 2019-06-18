package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdUnitInterestRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 18:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitInterestRequest {

    private List<UnitInterest> unitInterests;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitInterest{
        private Long unitId;
        private String itTag;
    }
}
