
import java.lang.*;
import java.util.*;

public class lc {
    public static void main(String[] args) {
        int a[]={3, 8, 5, 7, 6};
        Arrays.sort(a);

        int max=0;
        int cnt=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                continue;
            }

            if(a[i]==a[i-1]+1){
                cnt++;
            }else{
                
                if(cnt>max){
                    max=cnt;
                }
                cnt=1;
            }
            if(cnt>max){
                max=cnt;
            }
        }
        System.out.println(max);
    }
}
