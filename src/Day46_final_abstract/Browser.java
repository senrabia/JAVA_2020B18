package Day46_final_abstract;




public abstract class Browser {
     /*
    1. create an abstract class called Browser
               attribues: browserName
               methods:
                     abstract methods: get(URL), close(), maximize();
      2. creata three sub classes of Browser:
                        1. ChromeBrowser
                        2. FireFoxBrowser
                        3. OperaBrowser
                  each class MUST have constructors to initialize the attributes
               each actions should ONLY be applicable to the object it's called from
               Ex:
                  chrome.get("https://www.google.com")
                  output should be: chrome browse is opening https://www.google.com
                           (it should not open the URL in different browser other than chrome)
     */
     public String browsername;
     public abstract void ger(String url);
     public abstract void close();
     public abstract void maximize();

    public static void main(String[] args) {
        ChromeBrowser browser1=new ChromeBrowser("ChromeBrowser");
        browser1.get("https://www.google.com");
    }

}
class ChromeBrowser extends Browser{
    public ChromeBrowser (String browsername){
        this.browsername=browsername;
    }
    public void get (String url){
        System.out.println(browsername+"is opening "+url);
    }

    @Override
    public void ger(String url) {
        
    }

    public void close(){ }

    public void maximize() { }
}

class FirefoxBrowser extends Browser{
    public FirefoxBrowser(String browsername){
        this.browsername=browsername;
    }
    public void get(String url){
        System.out.println(browsername+" is opening"+url);
    }

    @Override
    public void ger(String url) {

    }

    public void close(){
    }
    public void maximize(){
    }
}
class OperaBrowser extends Browser{
    public OperaBrowser(String browsername){
        this.browsername=browsername;
    }
    public void get(String url){
        System.out.println(browsername+" is opening"+url);
    }

    @Override
    public void ger(String url) {

    }

    public void close(){
    }
    public void maximize(){
    }
}