package com.zkyne.advert.dump;

/**
 * @ClassName: DataConstant
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/14 11:27
 */
public class DataConstant {
    private DataConstant(){}

    public static final String DATA_ROOT_DIR = "/data/zkyne/advert/mysql_data/";

    /**
     * 各个表数据的存储文件名
      */
    public static final String ADVERT_PLAN = "advert_plan.data";
    public static final String ADVERT_UNIT = "advert_unit.data";
    public static final String ADVERT_CREATIVE = "advert_creative.data";
    public static final String ADVERT_CREATIVE_UNIT = "advert_creative_unit.data";
    public static final String ADVERT_UNIT_IT = "advert_unit_it.data";
    public static final String ADVERT_UNIT_DISTRICT = "advert_unit_district.data";
    public static final String ADVERT_UNIT_KEYWORD = "advert_unit_keyword.data";
}
