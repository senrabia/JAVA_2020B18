package Day41_Inheritance.Task1;



public class EmployeeObject {

    public static void main(String[] args) {

        Developer dev1 = new Developer(120000,"Namik",123,"Software Developer", 'M');
        //  dev1.reporting();
        dev1.fixingBug();
        System.out.println( dev1 );
        Tester tester1 = new Tester("Hilal", 120005, 456, "QA", 'F' );
        // tester1.coding();
        tester1.reporting();

        System.out.println( tester1 );

        BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur", 120000, 789, 'M');
       // BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur", 120002, 789, 'M');
        // BA1.coding();
        //  BA1.fixingBug();
        BA1.writingReq();
        BA1.gathering();


        System.out.println( BA1);


    }

}
