import java.util.*;
public class Rtt {
    public static void main(String[] args) {
        char roman[]={'I','V','X','L','C','D','M'};  
        int integer[]={1,5,10,50,100,500,1000};
        String ques="MCMXCIV";
        int ans=0;

        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<ques.length();i++){
            int a=indexOf(roman,ques.charAt(i));
            if(st.size()==0){
                st.push(ques.charAt(i));
                ans+=integer[a];
            }else{
                char ch=st.peek();
                if(indexOf(roman,ch)>=a){
                    ans+=integer[a];
                    st.push(ques.charAt(i));
                }else{
                    ans=ans+integer[a]-2*integer[indexOf(roman,st.pop())];
                }
            }
        }
        System.out.println("ans--->"+ans);
    }

    public static int indexOf(char a[],char c){
        for(int i=0;i<a.length;i++){
            if(a[i]==c){
                return i;
            }
        }

        return 0;
    }
}