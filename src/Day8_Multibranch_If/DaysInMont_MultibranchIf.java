package Day8_Multibranch_If;

public class DaysInMont_MultibranchIf {
    public static void main(String[] args) {
        byte months=5;//if we used negative num give me EROR
        String result=" ";
        if(months==1){ result="januarynhas 31 days";}
        else if(months==2){ result="february has 28 or 29 days";}
        else if(months==3){ result="March has 31 days";}
        else if(months==4){ result="April has 30 days";}
        else if(months==5){ result="May has 31 days";}
        else if(months==6){ result="June has 30 days";}
        else if(months==7){ result="July has 31 days";}
        else if(months==8){ result="August has 31 days";}
        else if(months==9){ result="September has 30 days";}
        else if(months==10){ result="October has 31 days";}
        else if(months==11){ result="November has 31 days";}
        else if(months==12){ result="December has 31 days";}
        else{result="Invalid Entery";}
        System.out.println(result);

    }
}





