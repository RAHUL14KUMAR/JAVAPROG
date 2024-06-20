
import java.util.*;

public class mar {
    public static void main(String[] args){
        int a[]={3,2,5,4,6,7,5};
        Arrays.sort(a);
       
        int mis=0;
        int rep=0;
        int min=a[0];

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(list.size()==0){
                list.add(a[i]);
            }else{
                int prev=list.get(list.size()-1);
                if(prev==a[i]){
                    rep=a[i];
                }else{
                    list.add(a[i]);
                }
            }
        }

        for(int i=1;i<list.size();i++){
            if(list.get(i)!=list.get(i-1)+1){
                mis=list.get(i-1)+1;
            }
        }

        if(!list.contains(min-1) && (min-1)>0){
            mis=min-1;
        }

        if(mis==0){
            mis=list.get(list.size()-1)+1;
        }

        System.out.println("Missing number is "+mis);
        System.out.println("the repetitive number is "+rep);
    }
}
