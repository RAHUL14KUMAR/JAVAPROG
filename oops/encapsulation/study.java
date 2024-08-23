private class person{
    private int eyes;

    person(int e){
        this.eyes=e;
    }

    void printInfo(){
        System.out.println(this.eyes+" ");
    }
}
public class study {
    public static void main(String[] args) {
        person p=new person(2);
        p.printInfo();
    }
}
