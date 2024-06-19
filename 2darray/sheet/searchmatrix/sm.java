public class sm {
    public static void main(String[] args){
        int arr[][]={
            {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        int target=25;

        int left=0;
        int right=arr[0].length-1;

        while(left<arr.length && right>=0){
            if(arr[left][right]>target){
                right--;
            }else if(arr[left][right]<target){
                left++;
            }else{
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
