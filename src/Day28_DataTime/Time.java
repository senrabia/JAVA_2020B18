package Day28_DataTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
      /*LocalTime now=LocalTime.now90;()==>returns current time
        LocalTime time1=LocalTime.of(hour,minute,seond).
        DateTimeFormatting:
                     year: yy,yyyy
                     months:MM,MMM,MMM
                     day:dd
                     day name:E, EEE

                     hours:hh
                     minutes:mm
                     second:ss
                     am/pm:a
*/
        LocalTime time1=LocalTime.now();
        System.out.println(time1);
        LocalTime time2=LocalTime.of(23,50,30);
        System.out.println(time2);

    }

}
