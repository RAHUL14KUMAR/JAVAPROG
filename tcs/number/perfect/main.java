import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        perfect(num);
    }
    public static void perfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
                System.out.println("i->"+i);
                System.out.println("sum->"+sum);
            }
        }
        if(sum==num){
            System.out.println("The given number is perfect number");
        }else{
            System.out.println("The given number is not perfect number");
        }
    }
}
