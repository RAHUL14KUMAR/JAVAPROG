import java.util.*;
public class itop {
    public static void main(String[] args) {
           Stack<String> st=new Stack<>();
           String s="2+(5-3*6/2)";

           Stack<Character> stc=new Stack<>();
           for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='('){
                    stc.push(ch);
                }else{
                    if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                        stc.push(ch);
                    }else if(ch==')'){
                        while(!stc.isEmpty() && stc.peek()!='('){
                            char op=stc.pop();
                            String a=st.pop();
                            String b=st.pop();
                            st.push(op+b+a);
                        }
                        stc.pop();
                    }else{
                        st.push(ch+"");
                    }
                }
            }
            while(!stc.isEmpty()){
                char ch=stc.pop();
                String a=st.pop();
                String b=st.pop();
                st.push(ch+b+a);
            }
            System.out.println(st.pop());
    }
}
