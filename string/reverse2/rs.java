public class rs {
    public static void main(String[] args) {
        String s="the sky is blue";
        String arr[]=s.split(" ");

        int l=0;
        int r=arr.length-1;

        while(l<r){
            String temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;
            r--;
        }
        s="";
        for(int i=0;i<arr.length;i++){
            s=s+arr[i]+" ";
        }
        System.out.println(s.trim());
    }
}
