import java.util.*;
public class Bar {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max=findMax(a);
        for(int i=max;i>=1;i--){
            for(int j=0;j<a.length;j++){
                if(i<=a[j]){
                    System.out.print('*');
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static int findMax(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}



