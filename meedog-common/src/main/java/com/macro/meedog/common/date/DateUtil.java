package com.macro.meedog.common.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 
 * @modified 2021/2/23 11:22 下午
 */

public class DateUtil {
    public static String getConstellation(int month, int day) {
        String[] constellations = new String[]{"摩羯", "水瓶", "双鱼", "白羊", "金牛",
                "双子", "巨蟹", "狮子", "处女", "天秤", "天蝎", "射手", "摩羯"};
        int[] arr = new int[]{20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22, 22};// 两个星座分割日
        int index = month;
        // 所查询日期在分割日之前，索引-1，否则不变
        if (day < arr[month - 1]) {
            index = index - 1;
        }
        // 返回索引指向的星座string
        return constellations[index];
    }

    public static String getZodiac(int year, int month, int day) {
        Solar solar = new Solar();
        solar.setSolarYear(year);
        solar.setSolarMonth(month);
        solar.setSolarDay(day);
        Lunar lunar = Solar2Lunar.SolarToLunar(solar);
        int start = 1900;
        String[] years = new String[]{"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊",
                "猴", "鸡", "狗", "猪"};
        return years[(lunar.getLunarYear() - start) % years.length];
    }

    public static Date age2Date(int age, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, age);
        c.add(Calendar.MONTH, month);
        c.add(Calendar.DAY_OF_MONTH, day);
        return c.getTime();
    }
}

