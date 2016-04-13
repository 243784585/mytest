package com.xingluo.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hxhuang on 2016/3/18 0018.
 */
public class BannerDao {

    public static void main(String[] args){
        long time = 1458265272l ;//2016-03-18 09:41:12

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(14582652721000l));
        System.out.println(cal.get(Calendar.SATURDAY));
    }
}
