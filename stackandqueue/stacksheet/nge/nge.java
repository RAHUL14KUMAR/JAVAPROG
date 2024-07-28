package stack.stacksheet.nge;
import java.util.*;
public class nge {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        int n[]={3,10,4,2,1,2,6,1,7,2,9};

        int ans[]=new int[11];
        st.push(n[n.length - 1]);

        for(int i=n.length-2;i>=0;i--){
            if(n[i]>=st.peek()){
                while(!st.isEmpty() && n[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=st.peek();
                }
            }else{
                ans[i]=st.peek();
            }
            st.push(n[i]);
        }
        while(st.size()>0 && n[10]>st.peek()){
            st.pop();
        }
       ans[n.length-1]=st.pop();

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
