// if we add the class inside the main class we need to add use "static keyword" for that
public class m1 {
    public static class cat{
        String color;
        int legs;
        int eyes;
    
        void walk(){
            System.out.println("cat can walk");
        }
        void eat(){
            System.out.println("can can eat");
        }
    }
    public static void main(String [] args){
        cat c1=new cat();
        c1.walk();
        c1.eat();
    }
}