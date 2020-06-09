package Day8_Multibranch_If;

public class DaysInMonth {
    public static void main(String[] args) {
        /*write a program that can find the number of days in a month
            (Assume that Feb has 28 days)
            28 days: 2__30 days:4,6,9,11__31 days:1, 3,5,7,8,10,12           */
       // byte month=11;
        byte month=5;
        boolean days28= month==2;
        boolean days30=month==4 || month == 6|| month==9||month==11;
        boolean days31=days28==false&& days30==false;
        //boolean days31_2=!days28 && !days30;
        int days=6;
        if(days28){ days=28; }// System.out.println("it has 28 days");
            if(days30){days=30;}//System.out.println("it has 30 days");}
                if(days31){days=31;}//System.out.println("it has 31 days");}
        System.out.println(month);
    }
}

