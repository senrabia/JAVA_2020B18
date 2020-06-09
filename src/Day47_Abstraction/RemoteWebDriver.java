package Day47_Abstraction;
//10:30
/* ====== INPORTANT RULLS  =====
    - THERE ARE ONLY TWO WAYS TO ACHIEVE ABSTRACTION:
   1.ABSTRACT CLASS
   2.INTERFACE
  * Abstract class: means to be inherited
                  *A class that we cannat create object.
                  *when abstract class extended by regular class:

  * Why we cannot create objects from abstract class?
                 - Abstract is not concrete, object has to be concrete
__________________________________________________
-Final ve Abstract  Atesle su gibidir asla yan yana gelmez
-Abstract never be static final and private because final is constant.

*/

public abstract class RemoteWebDriver {
    public abstract void get(String URL);
    public abstract void quit();

    }





