package tcs.Array.average;
import java.util.*;
public class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+a[i];
        }

        float avg=(float)sum/size ;
        // we  print up to two decimal places
        System.out.println(Math.round(Math.pow(10,2)*avg)/Math.pow(10,2));
    }
}
