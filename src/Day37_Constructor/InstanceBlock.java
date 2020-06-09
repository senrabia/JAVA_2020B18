package Day37_Constructor;

public class InstanceBlock {
  static{
        System.out.println("static block");  //just  1 time
    }
    {
        System.out.println("Instance block1"); //just 2 time
    }

    public static void main(String[] args) {
        InstanceBlock obj1=new InstanceBlock();
        InstanceBlock obj2=new InstanceBlock();
  }
  { System.out.println("Instance block2");
    }
}


