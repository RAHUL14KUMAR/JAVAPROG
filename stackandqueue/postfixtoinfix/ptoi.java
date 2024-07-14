import java.util.*;
public class ptoi {
    public static void main(String[] args) {
        // String s="25362/*-+";
        String s="264*8/+3-";
        Stack<String> st=new Stack<>();
        Stack<Character> stc=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='*' || ch=='/' || ch=='+' || ch=='-'){
                String a=(st.pop());
                String b=(st.pop());
                char op=ch;

                st.push(""+b+op+a);
            }else{
                st.push(ch+"");
            }
        }

        System.out.println("prefix to infix-->"+st.pop());
    }
}
