import java.util.*;

public class sbs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;

        int arr[]={7,6,4,3,1};
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        bestTime(arr);
    }

    public static void bestTime(int a[]){
        int min=a[0];
        int max=0;

        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
            int sum=a[i]-min;
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
