package array.span;
import java.util.*;
public class Span {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max=findMax(a);
        int min=findMin(a);

        System.out.println("the max value"+max);
        System.out.println("the min value"+min);

        int span=max-min;

        System.out.println("the span value of this array"+ span);

    }

    public static int findMax(int a[]){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static int findMin(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}
