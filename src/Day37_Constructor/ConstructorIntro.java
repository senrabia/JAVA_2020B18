package Day37_Constructor;
//--2

public class ConstructorIntro {
  /*  regular method:
   ________________________________

  Acces-modifiers specifier return-type mwthodName(Parameter){
  Statements}
  acces modifiers: public ,protected, defult,privite
  specifiers: sytatic , abstrsct, final, synchronized
  return-type:void, any primitive and none primitives
  methodName: anyName
  parameter:any datatype
 ------------------------------------
 Constructor
 ____________________________________
  Constructor: very special method
  Every class MUST HAVE ,if we dont create one , compiler will creates the
  Acces-modifier MethodName(Parameters){
  Statements}
   class Test{   }
  creating object:
    Test obj = new Test();
    className objectName=new Constructor
    */
//Every class MUST HAVE a Constructor.

 //public method(){}  //constructor name MUST be same with class name


    public ConstructorIntro(int a){//Constructer with ergumet

        System.out.println("Constructor with parameter of int");
    }
    public static void main(String[]args){
   // ConstructorIntro obj=new ConstructorIntro();

      ConstructorIntro obj=new ConstructorIntro(10);  //object MUST BE created with existing Constructor
      ConstructorIntro obj2=new ConstructorIntro(10);


}


}
