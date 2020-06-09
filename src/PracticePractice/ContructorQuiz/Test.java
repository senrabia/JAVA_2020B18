package PracticePractice.ContructorQuiz;

public class Test {
 /* 	constructor calls:
            1. only constructor can call other constructor
            2. constructor cannot be called by its name,  this() is used for calling
            3. constructor call needs to be at the first step
            4. One constructor can only call one constructor
            5. Contructor cannot call itself or conatin itself   */

 /*1--Instance veriable are olso called fileds, each object has its own_
    copies of intance variable  ==>TRUE
    2-- any future that static keyword belongs to the class members. Class
    members are shared by the class and object. ==>TRUE
    3--static blocks and constructors execution depends on the creation of
    the object ==>FALS   THis one just o ne toime executed
    */
//= 4 ==============================================================
 /*   static int a;
      int b;

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.b = 10;
        obj1.a = 20;
        Test obj2 = new Test();
        obj1.b = 30;
        obj1.a = 40;
        System.out.println(obj1.b);  //30
        System.out.println(obj2.b); //0
        System.out.println(obj1.a); //40
        System.out.println(a);      //40
        System.out.println(obj2.a); //40
        System.out.println("================");
        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }
//= 5 ============================================================
 /*   static String Name = "Seyfo";
           String ID="007";

    public static void main(String[] args) {
        System.out.println(Name);
        System.out.println(ID); //give me a COMPILER  EROR (ID line)

        */
//= 6 =================================================================
/*
 public static String name;
 public Test(){
           name="Aysel Dalcicek";}
          {name="Muaz Gulen";}
    static{name="Hakan Orak";}  // it give me HAKAN ORAK

    public static void main(String[] args) {
        System.out.println(name);
    }

*/
//= 7 ==================================================
    /*
int score;
public  Test(){
    score=65;}
  static{score=55;}  //Compile EROR
    {score=75;}

    public static void main(String[] args) {
        Test obj=new Test();
        System.out.println(obj.score); }            */
    //= 8 ================================================
static int a;
int b;
long total=100;   //instence veriable
public Test(){
    total-=50;
}
public Test(int total){
    this();
  this.total+= total;          //2000;
}{total*=2; }

   static {           //Static block
       int total=20;  //Local variable
       total/=2;
       //total=5000;
      // total=1000;
}
    public static void main(String[] args) {
    Test obj=new Test(25);
        System.out.println(obj.total);
    }
}

