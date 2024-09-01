package tcs.Array.reverse;
import java.util.*;
public class re {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        reverse(a,0,n-1);
        print(a);
    }
    public static void print(int a[]){
        for(int val:a){
            System.out.print(val+" ");
        }
    }

    public static void reverse(int a[],int l,int h){
        while(l<h){
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
    }
}
