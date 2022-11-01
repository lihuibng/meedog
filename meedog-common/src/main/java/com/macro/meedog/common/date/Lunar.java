package com.macro.meedog.common.date;

import lombok.Data;

/**
 * @author 
 * @modified 2021/2/23 11:35 下午
 */
@Data
public class Lunar {
    public boolean isleap;
    public int lunarDay;
    public int lunarMonth;
    public int lunarYear;
}
