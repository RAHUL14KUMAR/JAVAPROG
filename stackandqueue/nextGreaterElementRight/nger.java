
import java.util.Stack;

public class nger {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int a[]={2,5,9,3,1,12,6,8,7};
        int nge[]=new int[a.length];
        nge[a.length-1]=-1;
        st.push(a[a.length-1]);

        for(int i=a.length-2;i>=0;i--){
            while(st.size()>0 && a[i]>=st.peek()){
                st.pop();
            }

            if(st.size()==0){
                nge[i]=-1;
                st.push(a[i]);
            }else{
                nge[i]=st.peek();
                st.push(a[i]);
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println("nger-->"+nge[i]);
        }
    }
}
