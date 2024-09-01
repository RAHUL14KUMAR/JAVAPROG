import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        int brr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        int array[]=removeDuplicates(brr);
        for(int i=0;i<arr.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("initial");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        for(int i=0;i<size;i++){
            // System.out.println("for data "+arr[i]);
            int index=findIndex(array,arr[i]);
            arr[i]=index+1;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] removeDuplicates(int narr[]){
        Arrays.sort(narr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<narr.length;i++){
            if(!list.contains(narr[i])){
                list.add(narr[i]);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
    public static int findIndex(int arr[],int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}
