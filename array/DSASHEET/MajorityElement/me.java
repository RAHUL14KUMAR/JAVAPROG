import java.util.*;

public class me {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        
        int count=n/3;
        int a[]={3,2,3};
        // for(int i=0;i<a.length;i++){
        //     a[i]=sc.nextInt();
        // }

        ME(a,count);
    }
    public static void ME(int a[],int cnt){
        HashMap<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(hmap.containsKey(a[i])){
                int prevcnt=hmap.get(a[i]);
                prevcnt++;
                hmap.put(a[i],prevcnt);
            }else{
                hmap.put(a[i],1);
            }
        }

        // for(HashMap.Entry<Integer,Integer>key:hmap.entrySet()){
        //     if(key.getValue()>cnt){
        //         System.out.println(key);
        //     }
        // }

        for(int keys:hmap.keySet()){
            if(hmap.get(keys)>cnt){
                System.out.println(keys);
            }
        }
    }
}
