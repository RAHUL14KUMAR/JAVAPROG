import java.util.*;

public class lg {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("entyer the number of element");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter the element in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max=a[0];
        for(int val:a){
            if(val>max){
                max=val;
            }
        }

        System.out.println(max);
    }
}
