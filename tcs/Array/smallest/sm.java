package tcs.Array.smallest;
import java.util.*;

public class sm {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("entyer the number of element");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter the element in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int min=a[0];
        for(int val:a){
            if(val<min){
                min=val;
            }
        }

        System.out.println(min);
    }
}
