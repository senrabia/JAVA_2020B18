package Day28_DataTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Time_Formatting {
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
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a ");
        LocalTime time1=LocalTime.of(16,30);
        System.out.println(time1.format(dtf));//04:30 PM
        LocalTime time2=LocalTime.of(12,0);
        System.out.println(time2.format(dtf));
        LocalTime time3=LocalTime.of(0,0);
        System.out.println(time3.format(dtf));
        //==========================================
        boolean result1=time1.isAfter(time2);
        System.out.println(result1);
    }

    }

