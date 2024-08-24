interface person{
    int age=12;
    String type="human";

    void eat();
    void walk();

    // interface is by default use abstract method even if we dont initialize with abstract class keyword;

    // default method is used to provide the default implementation of the method;

    // and if the interface contain 5 different abstract method to call then the class who implement the interface must implement all the 5 abstract method and if we don't it will throw an error;
    default void giveInfo(){
        System.out.println(age);
        System.out.println(type);
    }
    
}

interface passion{
    String hobby="playing guiter";
    void play();
}

class rahul implements person,passion{
    public void eat(){
        System.out.println("rahul is eat");
    }
    public void walk(){
        System.out.println("rahul is walking");
    }

    String hobby=passion.hobby;
    public void play(){
        System.out.println(passion.hobby);
    }
    public void interest(){
        System.out.println("rahul hobby is "+hobby);
    }


}
public class main {
    public static void main(String[] args) {
        rahul r=new rahul();
        System.out.println(r.age);
        r.interest();
        r.play();
        r.walk();
        r.eat();
        System.out.println(r.type);

        r.giveInfo();
    }
}
