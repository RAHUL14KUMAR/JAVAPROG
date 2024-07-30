
import java.util.PriorityQueue;

public class pq {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int a[]={1, 4, 2, 3};
        int b[]={2, 5, 1, 6};
        int c=4;

        for(int val:a){
            for(int i=0;i<b.length;i++){
                if(pq.size()<c){
                    pq.add(val+b[i]);
                }else{
                    pq.remove();
                    pq.add(val+b[i]);
                }
            }
        }

        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
