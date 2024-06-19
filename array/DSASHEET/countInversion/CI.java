
public class CI {

    public static void main(String[] args) {
        long max = 0;
        long arr[] = {2, 5, 1, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            long cnt = hmsir(arr, i+1 , arr[i]);

            max = max + cnt;
        }
        System.out.println(max);
    }
    public static int hmsir(long a[],int index,long ele){
        int cnt=0;
        for(int i=index;i<a.length;i++){
            if(ele>a[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
