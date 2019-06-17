package com.zkyne.advert.constant;

import lombok.Getter;

/**
 * @ClassName: CreativeMetrialType
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:08
 */
@Getter
public enum CreativeMetrialType {
    // 广告素材类型
    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXT(5, "txt");

    private int type;
    private String desc;

    CreativeMetrialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
