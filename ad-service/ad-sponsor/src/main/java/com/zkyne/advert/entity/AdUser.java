package com.zkyne.advert.entity;

import com.zkyne.advert.constant.CommonStatus;
import com.zkyne.advert.utils.CommonUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName: AdUser
 * @Description: 推广用户
 * @Author: zkyne
 * @Date: 2019/6/14 13:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_user")
public class AdUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "username", nullable = false)
    private String username;

    @Basic
    @Column(name = "token", nullable = false)
    private String token;

    @Basic
    @Column(name = "user_status", nullable = false)
    private Integer userStatus;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "modify_time", nullable = false)
    private Date modifyTime;

    public AdUser(String username, String token) {
        this.username = username;
        this.token = token;
        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }

    public AdUser(String username) {
        this.username = username;
        this.token = CommonUtils.md5(username);
        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }
}
