package Day47_Abstraction;
//11:00
public final class ChromeDriver extends RemoteWebDriver{
   @Override
    public void get (String URL) {
       System.out.println("Opening "+URL+" in chrome");
    }
    @Override
    public void quit(){
        System.out.println("Closing the chrome browser");
    }

}
