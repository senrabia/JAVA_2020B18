package Day19_Arrays;

public class Arrays_Practice1_Friends {
    public static void main(String[] args) {
        //Index number always start ==>0
        String[]friends={"Kuzzat", "Asiya","Saim","Akbar","Marufjan","Guljenet","Muradil"};
                      //    0        1        2      3       4          5
       /* System.out.println( friends[6] );
        String s1=friends[2];
        System.out.println();*/

       for(int i=0; i<=6; i++){
          String name=friends[i];
           System.out.println(name);}
        System.out.println("===============================");
       String[]emails={"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};
       //print out all the users who registered with thier gmail
        //max: 4
        for(int i=0; i<=3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }
    }
}

