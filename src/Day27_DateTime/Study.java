package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Study {
    public static void main(String[] args) {
        //**Just day lowercase**

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf1));
        System.out.println("==================================");
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEEE/dd/MMMM/YYYY");
        LocalDate date2=LocalDate.of(2000,4,23);
        String str2=date2.format(dtf2);
        System.out.println(str2);
        LocalDate dare3=LocalDate.now();
        System.out.println(date2.format(dtf2));

        System.out.println("===================================");
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE/dd/MMM/YYYY");
        LocalDate ld=LocalDate.now();
        System.out.println(ld.format(dtf));

        System.out.println("====================================");
        LocalDate now=LocalDate.of(2020,4,23);
        System.out.println(now);
        LocalDate birth=LocalDate.of(1982,10,4);
        System.out.println(birth);
        boolean result1=now.isBefore(birth);  System.out.println(result1);
        boolean result2=now.isAfter(birth);   System.out.println(result2);
        boolean result3=now.isEqual(birth);   System.out.println(result3);
        boolean result4=birth.isLeapYear();   System.out.println(result4);


    }
}
