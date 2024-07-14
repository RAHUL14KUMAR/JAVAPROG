import java.util.*;
public class ptoi {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        String s="+2-5*3/62";

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String a=st.pop();
                String b=st.pop();
                st.push(b+ch+a);
            }else{
                st.push(ch+"");
            }
        }
        StringBuilder sb=new StringBuilder(st.pop());
        // direct way to reverse the string
        System.out.println("prefix to infix-->"+sb.reverse().toString());
    }
}
