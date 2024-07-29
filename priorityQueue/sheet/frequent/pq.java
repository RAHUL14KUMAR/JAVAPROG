import java.util.*;

public class pq {
    public static class pair{
        int val;
        int cnt;

        pair(int val,int cnt){
            this.val=val;
            this .cnt=cnt;
        }
    }
    public static void main(String args[]){
        int a[]={7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k=4;

        PriorityQueue<pair> pq=new PriorityQueue<>((p1,p2)-> p1.cnt-p2.cnt);
        HashMap<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(hmap.containsKey(a[i])){
                int cnt=hmap.get(a[i]);
                hmap.put(a[i],cnt+1);
            }else{
                hmap.put(a[i],1);
            }
        }  

        for(int i:hmap.keySet()){
            System.out.println("set "+i+" "+hmap.get(i));
        }
        
        for(int i:hmap.keySet()){
            pair p=new pair(i,hmap.get(i));
            if(pq.size()<k){
                pq.add(p);
            }else{
                if(hmap.get(pq.peek().val)<=hmap.get(i)){
                    System.out.println("the peek value->"+pq.peek().val+" "+pq.peek().cnt);
                    pq.remove();
                    pq.add(p);
                }else{
                    System.out.println("the else value->"+pq.peek().val+" "+pq.peek().cnt);
                }
            }
        }

        while(pq.size()>0){
            System.out.println(pq.remove().val);
        }
    }
}
