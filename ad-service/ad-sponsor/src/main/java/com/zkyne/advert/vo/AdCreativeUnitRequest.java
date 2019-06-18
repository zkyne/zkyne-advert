package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdCreativeUnitRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 17:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdCreativeUnitRequest {

    private List<CreativeUnit> creativeUnits;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreativeUnit {

        private Long creativeId;
        private Long unitId;
    }

}
