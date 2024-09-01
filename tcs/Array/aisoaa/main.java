import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int arr1[]={1,3,4,5,2};
        int arr2[]={4,3,1,7,5,15};

        checkArray1Subsetof2(arr1,arr2);
    }
    public static void checkArray1Subsetof2(int a[],int b[]){
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],true);
        }

        for(int i=0;i<b.length;i++){
            if(map.containsKey(b[i])){
                map.put(b[i],false);
            }
        }

        int cnt=0;
        for(int key:map.keySet()){
            if(map.get(key)==true){
                System.out.println("arr1 is not the subset of array 2");
                break;
            }else{
                cnt++;
            }
        }

        if(cnt==map.size()){
            System.out.println("arr1 is the subset of array 2");
        }
    }
}
