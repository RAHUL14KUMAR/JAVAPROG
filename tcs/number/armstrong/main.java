import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int len=length(num);
        armstrong(num,len);
    }
    public static int length(int num){
        int temp=num;
        int cnt=0;
        while(temp!=0){
            cnt++;
            temp=temp/10;
        }
        return cnt;
    }
    public static void armstrong(int num,int len){
        int temp=num;
        int sum=0;

        while(temp!=0){
            int rem=temp%10;
            sum=sum+(int)Math.pow(rem,len);
            temp=temp/10;
        }

        if(sum==num){
            System.out.println("The given number is armstrong");
        }else{
            System.out.println("The given number is not armstrong");
        }
    }
}