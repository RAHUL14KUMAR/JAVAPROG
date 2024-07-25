import java.util.*;
public class nge {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        int n[]={3,10,4,2,1,2,6,1,7,2,9};

        int ans[]=new int[n.length];
        int a=n[10];
        st.push(a);

        for(int i=n.length-2;i>=0;i--){
            if(n[i]>st.peek()){
                while(!st.isEmpty() && n[i]>st.peek()){
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
        }
        if(st.size()>0){
            ans[n.length-1]=st.pop();
        }else{
            ans[n.length-1]=-1;
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
