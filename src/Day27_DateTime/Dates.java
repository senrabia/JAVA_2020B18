package Day27_DateTime;
import java.time.LocalDate;
public class Dates {
    /*Local Date:used for reating date (year, months ,days)
       methods:
           isAfter():
           isBefore():
           isEqual():
           isLeapyear():
     */
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2020,10,25);
        System.out.println(date1);
        LocalDate birthday= LocalDate.of(2000,12,25);
        System.out.println(birthday);

        //isAfter(date2)
        boolean result1= date1.isAfter(birthday);
        System.out.println(result1);
        //isBefore(date2)
        boolean result2= date1.isBefore(birthday);
        System.out.println(result1);
        //isEqual(date2)
        boolean result3= date1.isEqual(birthday);
        System.out.println(result3);
        //isLeapyear
        boolean result4= birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("=========================");

        //***** MORE USEFUL IT WILL *****
        LocalDate now=LocalDate.now(); //2020-04-23
        System.out.println("Today is: "+now);

        String str=now.toString();// - - kaldirmak icin
        System.out.println(str.replace("-"," "));

        //mont/day/year





    }


}
