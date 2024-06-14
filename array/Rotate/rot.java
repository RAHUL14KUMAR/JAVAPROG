import java.util.*;
public class rot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("enter array input");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("enter the rotaion number value");
        int rot=sc.nextInt();

        rotate(a,rot);

        System.out.println("output array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void rev(int a[],int l,int r){
        int left=l;
        int right=r;

        while(left<=right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;

            left++;
            right--;
        }
    } 

    public static void rotate(int a[],int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }

        rev(a,0,a.length-k-1);
        rev(a,a.length-k,a.length-1);
        rev(a,0,a.length-1);
    }
}
