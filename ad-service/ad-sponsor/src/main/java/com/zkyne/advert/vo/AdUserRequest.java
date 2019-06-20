package com.zkyne.advert.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @ClassName: AdUserRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/20 17:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUserRequest {

    private String username;
    public boolean validate() {
        return StringUtils.isNotEmpty(username);
    }
}
