package OfficeHours.Package05_27_2020;
//15:20
public class methodOverriding2 {
    protected void method1(){ }
    public static void method2(){}
    public methodOverriding2(){}
}

class TestClass extends methodOverriding{
    @Override
    protected void method1(){}
    //   @override  //EROR
    // public static void metod2(){}
    //  public methodOverriding2(){}
}