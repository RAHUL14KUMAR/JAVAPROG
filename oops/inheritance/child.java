package oops.inheritance;

class child extends parents{
    String address;
    public child(String name, int age,String address) {
        super(name, age);
        this.address=address;
    }  
    
   public void printInfo(){
        System.out.println(this.name+" "+this.age+" "+this.address);
    }

   
}
