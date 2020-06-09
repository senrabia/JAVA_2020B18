package Day38_Constructor;
//--6
public class Dog {
    String name;
    String breed;
    int age;
    public Dog() {//sets the default value for all instances
        name = "unknown";
        breed = "unknown";
        age = 0;
    }
    //if you have same parameter same name it is EROR BUT(ve need parameter is that work)

    public Dog(String breed) {
        this.breed = breed;
        name = "unknown";
        age = 0;
    }
    public Dog(String breed,int age) {
        this.breed = breed;
        this.age = age;
        name = "Unknow";

    }public String toString(){
        return "Name: "+name+", breed: "+breed+", age: "+age;
    }}
/*
public void method1(){
 }
 public void Method1(int a){
 }            */

