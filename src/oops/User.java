package oops;

public class User {
    private String name;
    private int age;

    public User(){}

    public User(String name, int age){
        this.age=age;
        this.name=name;
    }

    public void setName(){
        this.name = name;
    }

    public void setAge(){
        this.age = age;
    }

    public void print(){
        System.out.println("User is " + name + " of age " + age);
    }
}
