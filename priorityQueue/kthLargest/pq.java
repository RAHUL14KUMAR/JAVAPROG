package priorityQueue.kthLargest;
import java.util.*;

public class pq {
    public static void main(String args[]){
        int a[]={2,10,5,17,7,18,6,4};
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your kth largest number place");
        int num= sc.nextInt();


        for(int i=0;i<a.length;i++){
            if(i<num){
                pq.add(a[i]);

            }else{
                if(pq.peek()<a[i]){
                    pq.remove();
                    pq.add(a[i]);
                }
            }
        }

        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
