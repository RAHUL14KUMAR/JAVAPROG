import java.util.ArrayList;

public class subarray {
    public static void main(String[] args) {
        int arr[]={3, 4, 5, 1, 3, 3, 1, -4};
        int k=12;
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                al.add(arr[j]);
                // System.out.println(adding);
                if(sum==k){
                    printArrayList(al);
                }
            }
        }
    }
    public static void printArrayList(ArrayList<Integer>al){
        System.out.print('[');
        for(int i=0;i<al.size();i++){
            if(i!=al.size()-1){
                System.out.print(al.get(i)+", ");
            }else{
                System.out.print(al.get(i));
            }
        }
        System.out.print(']');
        System.out.println();
    }
}
