package sk.stu.fiit.utils;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Utils {

    private static Date removeHours(Date arg0) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(arg0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static int DAYS_BETWEEN(Date arg0, Date arg1) {
        if (arg0 == null || arg1 == null || arg1.before(arg0)) {
            return -1;
        }
        arg0 = removeHours(arg0);
        arg1 = removeHours(arg1);
        return (int) ChronoUnit.DAYS.between(arg0.toInstant(), arg1.toInstant());
    }
}
