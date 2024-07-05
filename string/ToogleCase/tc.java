public class tc {
    public static void main(String[] args){
        String s="pepCODING";
        String ans="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                ans=ans+(char)('A'-'a'+ch);
            }else{
                ans=ans+(char)('a'-'A'+ch);
            }
        }
        System.out.println(ans);
    }
}
