import java.util.*;
public class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
         
        for(int i=0;i<size;i++){
            if(prefix==0){
                prefix=1;
            }

            if(suffix==0){
                suffix=1;
            }

            prefix=arr[i]*prefix;
            suffix=arr[size-1-i]*suffix;

            max=Math.max(max,Math.max(prefix,suffix));
        }
        System.out.println("max-->"+max);
    }
}
