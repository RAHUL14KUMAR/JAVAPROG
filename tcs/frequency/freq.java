import java.util.*;
public class freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hmap=new HashMap<>();   

        System.out.println("enter the size of the array");
        int n=5;

        int a[]= {10,5,10,15,10,5};
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }

        for(int i=0;i<n;i++){
            if(hmap.containsKey(a[i])){
                hmap.put(a[i],hmap.get(a[i])+1);
            }else{
                hmap.put(a[i],1);
            }
        }

        for(int an:hmap.keySet()){
            System.out.println(an+" "+hmap.get(an));
        }
    }
}
