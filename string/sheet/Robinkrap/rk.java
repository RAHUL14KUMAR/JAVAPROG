public class rk {
    public static void main(String[] args) {
        String a="abcd";
        String b="cdabcdab";
        int cnt=1;
        
        StringBuilder sb=new StringBuilder("");

        int i=0,j=0;
        while(true){
            if(i>=a.length()){
                i=0;
                cnt++;
            }

            if(b.charAt(j)==a.charAt(i)){
                sb.append(a.charAt(i));
                j++;
            }
            
            if(b.equals(sb.toString())){
                break;
            }
            i++;
        }
        System.out.println(cnt);
    }
}
