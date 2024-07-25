public class pbv {
    public static void main(String [] args){
        int c=34;
        int d=12;
        swap(c,d);
        System.out.print(c+" "+d);
    }  
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }  
}


// java is always pass by value not pass by refrence
// in the above we pass the parameter value and that  is copied to another variable and then coped value is passed;
// if java followed pass by refernce then our desired result is 12 and 34.