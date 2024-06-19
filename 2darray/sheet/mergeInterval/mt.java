
import java.util.*;

public class mt {
    public static void main(String[] args){
        int intervals[][]={
            {1,3},{2,8},{8,10},{15,18}
        };
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        ArrayList<int[]> list= new ArrayList<>();

        for(int[] inter:intervals){
            if(list.size() == 0){
                list.add(inter);
            }else{
                int prevInter[]=list.get(list.size()-1);
                if(prevInter[1]>=inter[0]){
                    prevInter[1]=Math.max(prevInter[1],inter[1]);
                } else {
                    list.add(inter);
                }
            }
        }
        print(list);
    }
    public static void print(List<int[]> arr){
        int n=arr.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.get(i).length;j++){
                System.out.print(arr.get(i)[j]+"  ");
            }
            System.out.println();
        }
    }
}
