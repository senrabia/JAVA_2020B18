package Day44_Exceptions;
//10:00
/*  warmup task:
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions

 */
public class Browsers {
    protected void openBrowser() {
        System.out.println(" opening the default browser");
    }
    protected void closeBrowser(){
        System.out.println(" closing the default browser");
}
}
class ChromeBrowser extends Browsers{
    /* openBrowser()
       closeBrowser()
     */
    @Override
    public void openBrowser(){
        System.out.println("Opening the chrome browser");
    }
   // @Override
    public void closeBrowser(){
        System.out.println("Closing the chrome browser");
    }
}
//========================= FIREFOX  ==========================
class FirefoxBrowser extends Browsers{
 @Override
  public void openBrowser() {
      System.out.println("Opening the Firefox browser");
  }
  @Override
    public void closeBrowser(){
        System.out.println("Closing the Firefox browser");

}}

class Test{
    public static void main(String[] args) {
        ChromeBrowser obj=new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();
        System.out.println("===================================");
        FirefoxBrowser ob21=new FirefoxBrowser();
        obj.openBrowser();
        obj.closeBrowser();
    }
}
