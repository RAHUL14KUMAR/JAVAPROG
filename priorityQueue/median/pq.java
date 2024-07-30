import java.util.*;

public class pq {
    public static class median{
        PriorityQueue<Integer> lp;
        PriorityQueue<Integer> rp;

        median(){
            lp=new PriorityQueue<>(Collections.reverseOrder());
            rp=new PriorityQueue<>();
        }

        void add(int val){
            if(lp.size()==0){
                lp.add(val);
            }else if (rp.size()>0 && rp.peek()<val) {
                rp.add(val);
            }else{
                lp.add(val);
            }

            if(lp.size()-rp.size()==2){
                rp.add(lp.remove());
            }else if (rp.size()-lp.size()==2) {
                lp.add(rp.remove());
            }
        }

    }
}
