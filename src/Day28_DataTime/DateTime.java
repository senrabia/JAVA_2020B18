package Day28_DataTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    /*LocalDateTime:combination of Localdate&LocalTime
      LocaldateTime dt=LocaldateTime.now(); //current date&time
      LocalDateTime dt2=LocalDateTime.of(date,time)
      LocalDateTime dt3=LocalDateTime.of()
     */
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        //2020-30-20 11:25:30
        LocalDate date1=LocalDate.of(2020,3,20);
        LocalTime time1=LocalTime.of(11,25,30);
        LocalDateTime dateTime=LocalDateTime.of(date1,time1);
        System.out.println(dateTime);

        //========OVERLOADING PARAMETER============
        LocalDateTime dateTime2=LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime2);
        //=========================================
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2=LocalDate.of(2020,3,20);
        System.out.println(date2.format(dtf));


    }
}
