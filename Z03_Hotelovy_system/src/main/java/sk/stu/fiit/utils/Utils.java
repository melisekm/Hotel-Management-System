package sk.stu.fiit.utils;

import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Martin Melisek
 */
public class Utils {
    public static int DAYS_BETWEEN(Date arg0, Date arg1){
        /*if(arg0.before(arg1)){
            return -1;
        }*/
        return (int) ChronoUnit.DAYS.between(arg0.toInstant(), arg1.toInstant()) + 1;
    }
}
