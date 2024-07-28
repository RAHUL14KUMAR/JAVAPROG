
import java.util.Collections;
import java.util.PriorityQueue;

public class pq {
    public static void main(String args[]){
        int a[]={22,99,3,11,88,4,1};

        // this will lead to add number in increasing order
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        // to add number in decreasing order
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
            pq2.add(a[i]);
        }

        // to print in increasing order
        System.out.println("increasing order");
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }

        System.out.println("decreasing order");
        while(pq2.size()>0){
            System.out.println(pq2.peek());
            pq2.remove();
        }
    }
}
