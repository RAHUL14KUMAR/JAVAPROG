import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int tofind=sc.nextInt();
        int a=find(arr,tofind);

        System.out.println(a);

    }
    public static int find(int a[],int fin){
        int ind=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==fin){
                ind=i+1;
                break;
            }
        }
        return ind;
    }
}
