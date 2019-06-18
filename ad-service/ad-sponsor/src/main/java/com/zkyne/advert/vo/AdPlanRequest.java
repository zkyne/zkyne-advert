package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

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
    private String planName;
    private String startDate;
    private String endDate;

    /**
     * 更新删除使用
     */
    private Long planId;
    /**
     * 查询使用
     */
    private List<Long> planIds;

    public boolean createValidate() {

        return userId != null
                && !StringUtils.isEmpty(planName)
                && !StringUtils.isEmpty(startDate)
                && !StringUtils.isEmpty(endDate);
    }

    public boolean updateValidate() {
        return planId != null && userId != null;
    }

    public boolean deleteValidate() {
        return planId != null && userId != null;
    }

    public boolean queryValidate() {
        return userId != null && !CollectionUtils.isEmpty(planIds);
    }

}
