public class cas {
    public static void main(String args[]){
        int n=4;
        String ans=countAndSay(n,"1",1);
        System.out.println(ans);
    }
    public static String countAndSay(int n,String s,int i){
        if(i==n){
            return s;
        }

        String ans=covert(s);
        return countAndSay(n,ans,i+1);
    }
    public static String covert(String s){
        String ans="";
        int i=0;
        int j=0;
        while(j<s.length()){
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            ans=ans+s.charAt(i)+""+(j-i);
            i=j;
        }
        return ans;
    }
}
