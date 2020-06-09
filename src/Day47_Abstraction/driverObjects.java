package Day47_Abstraction;
//11:00
public class driverObjects {
    public static void main(String[] args) {
        //String URL= "https://www.google.com";//1
        ChromeDriver driver=new ChromeDriver();
       // driver.get(URL); //1
        driver.get("https://www.google.com ");
        driver.quit();   //Closing
        System.out.println("========================");

        FirefoxDriver driver2=new FirefoxDriver();
        driver2.get("https://www.google.com ");
        driver2.quit();  //Closing
        System.out.println("=========================");

        OperaDriver driver3=new OperaDriver();
        driver3.get("https://www.google.com ");
        driver3.quit ();
} }
