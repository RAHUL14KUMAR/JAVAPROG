import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("array input");

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        rev(a);

        System.out.println("array output");

        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }  
    public static void rev(int a[]){
        int left=0;
        int right=a.length-1;

        while(left<=right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;

            left++;
            right--;
        }
    } 
}
