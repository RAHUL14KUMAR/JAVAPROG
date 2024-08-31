import java.util.*;
public class dtob {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("your decimal number is "+n);
        String sum="";
        int s=0;
        int c=0;

        while(n>1){
            int num=n%2;
            sum=num+sum;
            c=c+num*(int)Math.pow(10,s++);
            System.out.println("binary number is "+c);
            n=n/2;
        }
        sum=n+sum;
        c=c+n*(int)Math.pow(10,s);
        System.out.println("binary number is "+sum);
        System.out.println("binary number is "+c);
    }
}
