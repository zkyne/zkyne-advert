package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdUnitKeywordRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 18:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitKeywordRequest {

    private List<UnitKeyword> unitKeywords;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitKeyword{
        private Long unitId;
        private String keyword;
    }
}
