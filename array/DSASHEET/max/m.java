import java.util.*;
public class m {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnt++;
            }else{
                if(cnt>max){
                    max=cnt;
                }
                cnt=0;
            }
        }
        if(cnt>max){
            max=cnt;
        }
        System.out.println(max);
    }
}
