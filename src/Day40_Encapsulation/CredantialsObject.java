package Day40_Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class CredantialsObject {
    public static void main(String[] args) {
        Credentials facebook=new Credentials();
        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());

//=====================================================
        Credentials AnnaFacebook=new Credentials();

        AnnaFacebook.setUserName("A.Pauliar ");
        AnnaFacebook.setPassword("111111");
        System.out.println(AnnaFacebook.getUserName());
        System.out.println(AnnaFacebook.getPassword());

}}
