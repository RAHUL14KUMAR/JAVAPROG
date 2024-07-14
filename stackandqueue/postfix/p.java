import java.util.*;
public class p {
    public static void main(String[] args) {
        Stack<Integer> value =new Stack<>();
        String s="264*8/+3-";
        // Stack<String> st=new Stack<>();
        Stack<Character> stc=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='*' || ch=='/' || ch=='+' || ch=='-'){
                int a=value.pop();
                int b=value.pop();
                char op=ch;

                int val=performOpertion(op,b,a);
                value.push(val);
            }else{
                value.push(ch-'0');
            }
        }
        System.out.println("the answer is "+value.pop());
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

// 2+6*4/8-3