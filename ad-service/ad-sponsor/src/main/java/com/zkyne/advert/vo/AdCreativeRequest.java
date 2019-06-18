package com.zkyne.advert.vo;

import com.zkyne.advert.constant.CommonStatus;
import com.zkyne.advert.entity.AdCreative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: AdCreativeRequest
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/18 10:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdCreativeRequest {

    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Long size;
    private Integer duration;
    private Long userId;
    private String url;

    public AdCreative convertToEntity() {
        AdCreative creative = new AdCreative();
        creative.setName(this.name);
        creative.setType(this.type);
        creative.setMaterialType(this.materialType);
        creative.setHeight(this.height);
        creative.setWidth(this.width);
        creative.setSize(this.size);
        creative.setDuration(this.duration);
        creative.setAuditStatus(CommonStatus.VALID.getStatus());
        creative.setUserId(this.userId);
        creative.setUrl(this.url);
        creative.setCreateTime(new Date());
        creative.setModifyTime(creative.getCreateTime());
        return creative;
    }
}
