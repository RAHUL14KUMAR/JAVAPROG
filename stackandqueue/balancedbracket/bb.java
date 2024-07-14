import java.util.*;
public class bb {
    public static void main(String[] args){

        Stack<Character> st=new Stack<>();
        String s="((a+b)*(c+d)";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(st.peek()!='('){
                    if(st.isEmpty()){
                        System.out.println("not balanced");
                        return;
                    }else{
                        st.pop();
                    }
                }
                st.pop();
            }
        }

        if(st.isEmpty()){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
    }
}
