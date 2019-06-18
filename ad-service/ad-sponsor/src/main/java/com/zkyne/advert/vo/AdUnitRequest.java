package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @ClassName: AdUnitRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 17:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {
    private Long planId;
    private String unitName;

    private Integer positionType;
    private Long budget;

    public boolean createValidate() {
        return null != planId && StringUtils.isNotEmpty(unitName)
                && positionType != null && budget != null;
    }
}
