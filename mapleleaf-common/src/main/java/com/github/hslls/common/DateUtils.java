package com.github.hslls.common;

import com.github.hslls.common.struct.DateFields;

import java.util.Calendar;

/**
 * mapleleaf
 * lifengang@gmail.com
 */
public final class DateUtils {

    private DateUtils() {

    }

    public static DateFields resolveCalendar(Calendar c) {
        DateFields date = new DateFields();
        date.mYear = c.get(Calendar.YEAR);
        date.mMonth = c.get(Calendar.MONTH) + 1;
        date.mDay = c.get(Calendar.DAY_OF_MONTH);
        date.mHour = c.get(Calendar.HOUR_OF_DAY);
        date.mMinute = c.get(Calendar.MINUTE);
        date.mSecond = c.get(Calendar.SECOND);
        date.mMilliSecond = c.get(Calendar.MILLISECOND);
        return date;
    }

}
