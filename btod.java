import java.util.*;
public class btod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bn=sc.nextInt();

        System.out.println("your binary number is "+bn);
        int sum=0;
        int num=0;
        while(bn>0){
            int nums=bn%10;
            sum=sum+nums*(int)Math.pow(2,num++);
            bn=bn/10;
        }

        System.out.println("your decimal number is "+sum);
    }
}
