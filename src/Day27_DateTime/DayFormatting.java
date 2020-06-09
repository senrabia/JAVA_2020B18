package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DayFormatting {
    public static void main(String[] args) {
       /*Local Date:used for reating date (year, months ,days)
       methods:
           isAfter():
           isBefore():
           isEqual():
           isLeapyear():
           toString():
           format

      2020 -04- 23==>apr 23
       DateTimeForMatter:
            DateTimeForMatter dtf=DateTimeOfMatter.ofPattern("");
            year: yy, yyyy(three letters), MMMM (full name)
            month:MM(number), MMM
            day: dd
            days name=E(three letters), EEEE(full name)

        */

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE/ dd/MMM/YYYY");
        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf)); //

        /*create a date called birthday:month/Days/year
         ex: 2020 04 23
             Apr1/23/20
             Apr/23/20
         */

      DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEEE /MMMM /dd /YYYY");
      LocalDate date2=LocalDate.of(1999,12,25);
      String str1=date2.format(dtf);

      System.out.println(str1);

      LocalDate date3=LocalDate.now();
      System.out.println(date3.format(dtf2));

    }
}
