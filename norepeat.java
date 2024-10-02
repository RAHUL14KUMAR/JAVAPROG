import java.util.*;
public class norepeat {
    public static void main(String[] args) {
        int n=101;
        int k=200;
        int cnt=0;
        for(int i=n;i<=k;i++){
            String s=Integer.toString(i);
            int len=s.length();
            // System.out.println("len->"+len);
            HashSet<String> hs=new HashSet<>();

            int j=0;
            while(j<len){
                char ch=s.charAt(j);
                // System.out.println("ch->"+ch);
                if(!hs.contains(ch+"")){
                    hs.add(s.charAt(j)+"");
                    j++;
                }else{
                    hs.clear();
                    break;
                }
            }

            if(hs.size()>0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
