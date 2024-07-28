package stack.stacksheet.nse;
import java.util.*;
public class nse {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        int a[]={4, 5, 2, 10, 8};

        int ans[]=new int[a.length];
        st.push(a[0]);
        ans[0]=-1;

        for(int i=1;i<a.length;i++){
            if(a[i]<=st.peek()){
                while(!st.isEmpty() && a[i]<=st.peek()){
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
            st.push(a[i]);
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
