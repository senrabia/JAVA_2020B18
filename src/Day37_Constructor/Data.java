package Day37_Constructor;
/*/*regular import:
    syntex:
    Import PackageName.ClassName;  // imports one class from package
    import PackageName.*; //imports all classes from the package
    static imports: we can import static variables or methods.
    syntex:
     */
public class Data {
    static int staticVariable = 300;
    int instanceVariable = 400;

    public static void staticMethod() {
        System.out.println("static method");

    }

    public static void instanceMethod() {
        System.out.println("instance method");

    }
}