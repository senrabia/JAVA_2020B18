package Day36_StaticBlock;
/*  multi-class: we can have multiple classes ina same java file,
as long as there is only one public class.
  public class: name MUst be same with the file name.
  summry:
  1.gets executed as soon as the class is loaded Done
  2.designed to initialize static variables.
  3.we can have multiple classes in a same java file ,as long as
  there is only one public class.
  4.public class'name MUST be same with the file name.
  //Any java file has ,more then one file.
 */

// We can not make them public class will give compile eror even private give.
// MultiClass can have only one public class position not matter.
// Public Class needs to be a same name with class name, we need to run each one one by one not general run.


    class Tester{  //AM: default
        public static void main(String[] args) {
            System.out.println("Tester Class");
        }
    }
    class Developer{ //AM: default
        public static void main(String[] args) {
            System.out.println("Developer class");
        }
    }
    class scrumTeam{ //AM: default
        public static void main(String[] args) {
            System.out.println("Scrum Team Class");
        }}


    public class MultiClasses { //public class //just MULTICLASS
        public static void main(String[] args) {
            System.out.println("Public Class");
        }

    }
