class person{
    int eyes;
    int legs;
    int hands;

    person(int e,int l,int h){
        this.eyes=e;
        this.legs=l;
        this.hands=h;
    }

    void printInfo(){
        System.out.println(this.eyes+" "+this.legs+" "+this.hands);
    }
}

class rahul extends person{
    int age;
    String name;
    rahul(int e,int l,int h,int a,String n){
        super(e,l,h);
        this.age=a;
        this.name=n;
    }

    void studentinfo(){
        super.printInfo();
        System.out.println("rahul--> "+this.age+" "+this.name);
    }
}
public class study {
    public static void main(String[] args) {
        rahul r=new rahul(2,2,2,24,"rahul");
        r.studentinfo();
    }    
}