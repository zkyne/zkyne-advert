package com.zkyne.advert.constant;

import lombok.Getter;

/**
 * @ClassName: CreativeType
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:09
 */
@Getter
public enum CreativeType {
    //
    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
