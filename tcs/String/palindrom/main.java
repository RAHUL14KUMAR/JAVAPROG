import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        isPalindrome(input);
    }
    public static void isPalindrome(String input){
        int left=0;
        int right=input.length()-1;
        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                System.out.println("no palindromic string");
                return;
            }
            left++;
            right--;
        }

        System.out.println("palindromic string");
    }
}
