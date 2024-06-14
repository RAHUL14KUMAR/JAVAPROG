import java.util.*;

public class caf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("enter in the array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("data to find for ceila nd floor value");
        int dataToFind=sc.nextInt();

        int ceil=0;
        int floor=0;

        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(dataToFind<arr[mid]){
                floor=arr[mid-1];
                right=mid-1;
            }else if(dataToFind>arr[mid]){
                ceil=arr[mid+1];
                left=mid+1;
            }else{
                floor=ceil=arr[mid];
            }
        }

        System.out.println(ceil+" "+floor);
    }
}
