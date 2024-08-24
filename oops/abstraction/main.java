class person{
    public int age;
    public String name;
}

// if the abstract class contain 5 different abstract method to call then the class who extends the abstract class  must implement all the 5 abstract method and if we don't it will give error;

abstract class student{
    // inside the abstract class we can run not abstract function as well;  and abstrct functoin can be inside the abstract class;
    int noc=10;
    
    public abstract void study();
    void printInfo(){
        System.out.println(this.noc);
    }
    void eat(){}
}

class rahul extends student {
    int a;
    // @Override
    // public void study() {
    //     // Implementation of the abstract method
    //     System.out.println("stu1 is studying");
    // }

    public void study(){
        System.out.println("rahul is studying");
    }

    public void getA(){
        int c=super.noc;
        System.out.println("the value inside rahul is "+c);
    }
}



public class main {
    public static void main(String[] args) {
        person p=new person();

        // student s=new student();  for abstravtv class we cant create an object;

        rahul r=new rahul();
        r.study();
        r.getA();
    }
}
