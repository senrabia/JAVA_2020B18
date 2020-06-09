package OfficeHours.Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("Onur", "Junior Tester", 7500, 12000);
        Tester tester2 = new Tester();
        tester2.setInfo("Elton Jhon", "Junior Tester", 7500, 55555);
        Tester tester3 = new Tester();
        tester3.setInfo("Rahman", "SDET", 120000, 22222);
       //===================================
        ScrumTeam scrum1 = new ScrumTeam(); //we can use the arrayList in scrumteam class
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        scrum1.fireTester(1245);

        //scrum1.testersTeam //returns the testersTeam arrayLIst from scrum1

        for(Tester each: scrum1.testersTeam){ //proints out everysingle tester from scrumTeem
          System.out.println(each);
        }
        System.out.println("==========================================");
      Developer dev1=new Developer();
      dev1.setInfo("Barzy","Senior DEveloper",220200,1122337);

      Developer dev2=new Developer();
      dev2.setInfo("Emrah","Usta Developer",100000,223232);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);
       // scrum1.fireDeveloper(1122337);

      System.out.println(scrum1.devTeam.size());

      for(Developer each:scrum1.devTeam){ //arrayList of developer
          System.out.println(each);
      }
        System.out.println("============================");
        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()+" testers and "+
                scrum1.devTeam.size()+" developers");


    }
}
