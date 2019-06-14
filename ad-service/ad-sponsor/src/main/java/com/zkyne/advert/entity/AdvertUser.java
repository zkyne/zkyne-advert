package com.zkyne.advert.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Entity
@Table(name = "advert_table")
public class AdvertUser {

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

    public AdvertUser(String username, String token) {
        this.username = username;
        this.token = token;
//        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.modifyTime = this.createTime;
    }
}
