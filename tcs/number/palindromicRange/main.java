import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();

        printPalindrome(min,max);
    }
    public static void printPalindrome(int min,int max){
        for(int i=min;i<=max;i++){
            if(isPalindromic(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPalindromic(int num){
        int temp=num;
        int rev=0;
        while(temp!=0){
            int a=temp%10;
            rev=rev*10+a;
            temp=temp/10;
        }  
        if(rev==num){
            return true;
        } 
        return false;
    }
}
