
import java.util.ArrayList;

public class longestsubarray {
    public static void main(String[] args) {
        int a[]={1, 0, 0, 1, 0, 1, 1};
        int max=0;

        for(int i=0; i<a.length;i++){
            int zero=0;
            int one=0;
            ArrayList<Integer> al=new ArrayList<>();

            for(int j=i;j<a.length;j++){
                al.add(a[j]);
                if(a[j]==0){
                    zero++;
                }else{
                    one++;
                }

                if(zero==one){
                    max=Math.max(max,al.size());
                }
            }
        }
        System.out.println(max);
    }
}
