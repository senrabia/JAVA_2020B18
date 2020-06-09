package day12_ScannerClass;

public class Browsers {
    /*3. write a program that can display the selected browser
       1. declear a String variable called browserName
       2. Assume that the valid browsers are: chrome, firefox, opera, safari.
       3. if the browser name does not match with the valid browsers' names, out put should
*/
    public static void main(String[] args) {
        String browserName="Chrome";
        switch(browserName) {//RUULS==>case mutlaka kullanilmali burda{}yerine is yapiyor
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid Browser name, Please " +
                        "give the right browser name");
//RUULS If we use case"firefox" ||"Firefox not work because this is BOOLEAN
            }
        }

    }










