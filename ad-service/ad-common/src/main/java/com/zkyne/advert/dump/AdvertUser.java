package com.zkyne.advert.dump;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdvertUser
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 13:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertUser {

    private Long userId;
    private String username;
    private String token;
    private Integer userStatus;

    private Date createTime;
    private Date modifyTime;
}
