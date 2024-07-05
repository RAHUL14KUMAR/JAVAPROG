public class atoi {
    public static void main(String args[]){
        String s=" -042";
        int res=1;
        int ans=0;
        s=s.trim();

        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)=='-'){
                res=-1;
                continue;
            }else if(s.charAt(i)=='+'){
                continue;
            }

            int a=s.charAt(i)-'0';
            if(inRange(a)){
                ans=ans*10+a;
            }else{
                break;
            }
        }

        System.out.println(res*ans);
    }
    public static boolean inRange(int a){
        for(int i=0;i<=9;i++){
            if(a==i){
                return true;
            }
        }
        return false;
    }
}
