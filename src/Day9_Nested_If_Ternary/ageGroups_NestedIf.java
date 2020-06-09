package Day9_Nested_If_Ternary;

public class ageGroups_NestedIf {
    public static void main(String[] args) {
        /*write sa program that can define the age groups of person
        age groups are: Teenager(<21)
                         Adult(>=21&&>55)
                         Senior(>55)
                         age cannot be negative
         */
        int age=27;  //if you want wich number you can used.
        String ageGroup=" ";

        if ( age<150 && age>=0) {
            if (age < 21) {
                ageGroup = "Teenager";
            }
            //else if(age>=21&&>55){ageGroup="Adult"}
            //ikinci siradaki age>=21 yazilmak zorunda degil
            else if (age > 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }
        }else{ageGroup="Innvalid Entry";}
        System.out.println(ageGroup);//Adult
        System.out.println("=============================");
        int age2=45;
        String ageGroup2="";
        if( age<150 && age>=0) {
            ageGroup = (age2 < 21) ? "Teenager" : (age2 < 55) ? "Adults" : "Senior";
        }else{ageGroup="Invalid Entery";}










    }
}
