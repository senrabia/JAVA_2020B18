package Day37_Constructor;

//--1
 /*regular import:
    syntex:
    Import PackageName.ClassName;  // imports one class from package
    import PackageName.*; //imports all classes from the package
    static imports: we can import static variables or methods.
    syntex:
    import static PackageName.className.name; //only import one static fromthe class
    import static PackageName.className.*;   //imports all static variables and methods  from.
     */
//import java.util.Arrays; //only import Arrays class from java util

import java.util.*;  //Whay this one is MORE PREFER?? Because import ==>EVERY JAVA UTIL CLASS
 /* import static Day37_Contructor.Data.staticVariable;
    import static Day37_Contructor.Data.staticMethod;   */

public class ImportStatement {

    public static void main(String[] args) {
        int []arr={4,3,2,1};
        Arrays.sort(arr);
    }
}
