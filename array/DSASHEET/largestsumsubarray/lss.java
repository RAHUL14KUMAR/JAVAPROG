public class lss {
    public static void main(String[] args){
        int arr[]={9, -3, 3, -1, 6, -5};
        int target=6;
        int max=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;

            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];

                if(sum==target){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        System.out.println("max length "+ (max));
    }
}
