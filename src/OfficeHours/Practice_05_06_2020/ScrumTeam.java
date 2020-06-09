package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

/*create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp
crteate a class called BankofAmerica:
				Bank of America in VA is p-lanning to create a scrum teams:
						4 developers 2 testers
========================================================
ScrumTeam:
Attribute:
ArrayList<Tester>
ArrayList<Developers>

Actions:
  hireTester(Tester tester ):the given tester must be added in arrayList of tester
  fireTester(): whicever tester ID matches with the argument, the tester will be arrayList
 */
public class ScrumTeam {

    ArrayList<Tester> testersTeam=new ArrayList<>();
    ArrayList<Developer> devTeam=new ArrayList<>();


    public void hireATester(Tester tester){

        testersTeam.add(tester);
    }
    public void fireTester(long ID){
        testersTeam.removeIf(p->p.employeeID== ID);

    }
    public void hireDeveloper(Developer developer){
        devTeam.add(developer);

    }
    public void fireDeveloper(long ID){
        devTeam.removeIf(eachDev->eachDev.employeeID==ID);

    }



}
