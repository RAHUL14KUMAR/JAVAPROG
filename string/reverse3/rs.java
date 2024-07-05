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
            s=s+reverse(arr[i])+" ";
        }
        System.out.println(s.trim());
    }
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        int l=0;
        int r=s.length()-1;

        while(l<r){
            char right=s.charAt(r);
            char left=s.charAt(l);

            sb.setCharAt(r, left);
            sb.setCharAt(l, right);

            l++;
            r--;
        }
        s=sb.toString();
        return s;
    }
}
