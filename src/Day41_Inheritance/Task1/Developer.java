package Day41_Inheritance.Task1;

   /* creata a constructor that can initialize all the attributes of developer
            */

   public class Developer extends Employee {

    /*
    name(inherited)
    salary (inherited)
    id(inherited)
    jobtitle(inherited)
    gender(inherited)
    fixingBug()
    coding()
     */


        public Developer(double salary, String name, long id, String jobTitle, char gender){
            this.gender = gender;
            this.jobTitle = jobTitle;
            this.id = id;
            this.name = name;
            this.salary = salary;
        }


        public void fixingBug(){
            System.out.println(name+" is fixing the bug");
        }

        public void coding(){
            System.out.println(name+" is coding");
        }




    }