public class main{  
    static int count=0;//will get memory each time when the instance is created  
      
    main(){  
        count++;//incrementing value  
        System.out.println(count);  
    }  
      
    public static void main(String args[]){  
    //Creating objects  
        main c1=new main();  
        main c2=new main();  
        main c3=new main();  
    }  
}  