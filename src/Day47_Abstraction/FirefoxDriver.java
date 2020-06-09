package Day47_Abstraction;
//11:40;
public  class FirefoxDriver extends RemoteWebDriver {
    @Override
    public void get (String URL){
        System.out.println("Opening "+URL+" in Firefox");
    }
    @Override
    public void quit(){
        System.out.println("closing firefox browser");

    }
}
