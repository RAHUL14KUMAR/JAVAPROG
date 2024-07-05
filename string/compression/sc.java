public class sc {
    public static void main(String[] args) {
        String s="aaabbccccddaeef";
        int cnt=1;
        String ans=""+s.charAt(0);
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }else{
                if(cnt>1){
                    ans=ans+cnt;
                }
                ans=ans+s.charAt(i)+"";
                cnt=1;
            }
        }

        if(cnt>1){
            ans=ans+cnt;
        }
        System.out.println(ans);
    }
}
