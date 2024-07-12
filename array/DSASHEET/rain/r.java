import java.util.*;
public class r {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size and value in the array\n");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int leftArray[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                leftArray[i]=a[i];
            }else{
                leftArray[i]=Math.max(leftArray[i-1],a[i]);
            }
        }

        int rightArray[]=new int[n];
        for(int i=a.length-1;i>=0;i--){
            if(i==a.length-1){
                rightArray[i]=a[i];
            }else{
                rightArray[i]=Math.max(rightArray[i+1],a[i]);
            }
        }

        int sum=0;
        for(int i=0;i<n;i++){
            int min=Math.min(leftArray[i],rightArray[i]);
            sum=sum+min-a[i];
        }

        System.out.println("the total water stored->"+sum);
    }
}
