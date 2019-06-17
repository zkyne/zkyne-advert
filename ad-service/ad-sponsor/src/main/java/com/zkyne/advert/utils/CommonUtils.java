package com.zkyne.advert.utils;

import com.zkyne.advert.exception.AdvertException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;

import java.util.Date;

/**
 * @ClassName: CommonUtils
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/17 18:11
 */
public class CommonUtils {

    private static final String[] PARSE_PATTERNS = {"yyyy-MM-dd", "yyyy/MM/dd", "yyyy.MM.dd"};

    public static String md5(String value) {
        return DigestUtils.md5Hex(value).toUpperCase();
    }

    public static Date parseStringDate(String dateString) throws AdvertException {
        try {
            return DateUtils.parseDate(dateString, PARSE_PATTERNS);
        } catch (Exception ex) {
            throw new AdvertException(ex.getMessage());
        }
    }
}