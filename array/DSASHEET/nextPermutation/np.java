import java.util.*;
public class np {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        nextpermutation(arr);

        System.out.println("output array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void nextpermutation(int a[]){
        if(a.length<=1){
            System.out.println(a[0]);
        }

        int i=a.length-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }

        if(i>=0){
            int j=a.length-1;
            while(a[j]<=a[i]){
                j--;
            }
            swap(a,i,j);
            reverse(a, i+1, a.length-1);
        }
    }

    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void reverse(int a[],int l,int r){
        while(l<r){
            swap(a,a[l],a[r]);
            l++;
            r--;
        }
    }
}
