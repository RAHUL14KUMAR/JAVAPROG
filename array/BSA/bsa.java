import java .util.*;

public class bsa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int dataToFind=sc.nextInt();
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(dataToFind<arr[mid]){
                r=mid-1;
            }else if(dataToFind>arr[mid]){
                l=mid+1;
            }else{
                System.out.println("found in"+mid);
                return;
            }
        }

        System.out.println(-1);
    }
}
