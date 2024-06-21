
public class lsnr {
    public static void main(String[] args){

        String s="abcabcbb";
        String ans="";
        String b="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ans.length()==0){
                ans=ans+ch;
            }else if(b.contains(ch+"")){
                if(b.length()>ans.length()){
                    ans=b;
                }
                b="";
            }
            b=b+ch;
        }
        System.out.println("ans "+ ans);
    }
}
