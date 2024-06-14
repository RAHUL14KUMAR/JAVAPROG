import java.util.*;
public class inv {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("input array");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        int inv[]=new int[n];
        for(int i=0;i<a.length;i++){
            int b=a[i];
            inv[b]=i;
        }

        System.out.println("output array");
        for(int i=0;i<n;i++){
            System.out.print(inv[i]+" ");
        }
    }
}
