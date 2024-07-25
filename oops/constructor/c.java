// contructor name must be similar with classNName and it is used to initialize the variables inside the class
public class c {
    public static class cat{
        int legs;
        int eyes;

        cat(int legs,int eyes){
            this.legs=legs;
            this.eyes=eyes;
        }
    }
    public static void main(String[] args){
        cat c1=new cat(4,2);
        System.out.println(c1.legs);
    }    
}
