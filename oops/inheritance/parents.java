package oops.inheritance;

public class parents {
    String name;
    int age;

    public parents(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void printInfo(){
        System.out.println(this.name+" "+this.age);
    }
    public static void main(String[] args) {
        child obj=new child("rahul",24,"delhi");
        obj.printInfo();
    }
}
