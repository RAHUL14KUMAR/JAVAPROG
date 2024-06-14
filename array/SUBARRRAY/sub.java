import java.util.*;
public class sub {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int emp=0;

        for(int i=emp;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
