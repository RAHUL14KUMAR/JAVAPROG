import java.util.*;
public class i {
    public static void main(String[] args){
        String s="2+(5-3*6/2)";
        
        Stack<Integer> sti=new Stack<>();
        Stack<Character> stc=new Stack<>();
        int ans=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                stc.push(ch);
            }else if (ch==')'){
                while(!stc.isEmpty() && stc.peek()!='('){
                    // we need to perform opertions
                    char op=stc.pop();
                    int a=sti.pop();
                    int b=sti.pop();
                    ans=performOpertion(op,b,a);
                    sti.push(ans);
                }
                stc.pop();
            }else{
                if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                    stc.push(ch);
                }else{
                    sti.push(ch-'0');
                }  
            }
        }
        while(!stc.isEmpty()&&sti.size()>=2){
            ans=performOpertion(stc.peek(), sti.pop(), sti.pop());
            sti.push(ans);
        }
        System.out.println("ans->"+ans);
    }
    public static int performOpertion(char op,int a,int b){
        switch(op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }
}
