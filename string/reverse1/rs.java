public class rs {
    public static void main(String[] args){
        String s="abcdef";
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
        System.out.println(s);
    }
}
