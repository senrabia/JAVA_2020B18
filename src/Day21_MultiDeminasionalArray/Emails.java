package Day21_MultiDeminasionalArray;

public class Emails {
    public static void main(String[] args) {


    /*given an array:
    String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
    elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
    NOTE: MUST USE FOR EACH LOOP*/

    String[] emails={"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

    for(String eachEmail:emails) {
        if(eachEmail.contains("@gmail.com")){
        continue;
    }
        System.out.println(eachEmail);
        /* if (!EachEmail.endsWith("@gmail.com")) { //Sadece@gmail.com dont give me
            System.out.println(EachEmail);*/

    }

    }
}