import java.util.*;
public class r {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("enter array elements\n");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("after remove duplicates number from array\n");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        };

        // mapping object array to integer array
        int[] a = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("final array answer\n");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
