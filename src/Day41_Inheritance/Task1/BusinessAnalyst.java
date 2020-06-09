package Day41_Inheritance.Task1;


    public class BusinessAnalyst extends Employee {
        /*
        salary  (Inherited)
        name  (Inherited)
        id  (Inherited)
        jobTitle  (Inherited)
        gender  (Inherited)
        writingReq()
        gathering()
        toString() (Inherited)
         */
        public BusinessAnalyst(String name,double salary, long id,char gender){
            this.name=name;
            this.salary=salary;
            this.id=id;
            this.jobTitle="Business Analyst";
            jobTitle="Business Analyst";
            this.gender=gender;
        }

        public void writingReq(){
            System.out.println(name+" is writing requirements");
        }
        public void gathering(){
            System.out.println(name+" is gathering requirements");
        }
    }

