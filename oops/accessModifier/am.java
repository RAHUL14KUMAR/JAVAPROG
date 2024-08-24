class person{
    public int age;
    protected String name;
    // protected is access within the package;
    private int salary;

    person(){
        this.salary=240000;
    }
}
public class am {
    public static void main(String[] args) {
        person p=new person();
        p.age=24;
        p.name="rahul";
        // p.salary=240000;  this cant be access necause the private modiler only works within the class;
    }
}
