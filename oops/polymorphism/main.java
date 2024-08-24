class animal {
    private String name;
    private String color;

    public void eat(){
        System.out.println("animal is eating");
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}


class dog extends animal{
    public void eat(){
        System.out.println("dog is eating");
    }
}

class cat extends animal{
    
}   

public class main {
    public static void main(String[] args) {
        animal a = new animal();

        dog d = new dog();
        animal b =d;

        d.eat();
        a.eat();
        b.eat();
    }

}
