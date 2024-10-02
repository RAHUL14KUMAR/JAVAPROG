class Human{
    private int age;
    private String name;

    public void setData(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int[] getAge(){
        int a[]=new int[2];
        a[0]=age;
        a[1]=name.length();

        return a;
    }
    public String getName(){
        return name;
    }

    public void getData(){
        System.out.println(this.age+" "+this.name);
    }

}

public class study{
    public static void main(String[] args) {
        Human h=new Human();
        h.setData(22,"rahul");
        h.getData();
        System.out.println(h.getAge());
        System.out.println(h.getName());
    }
}