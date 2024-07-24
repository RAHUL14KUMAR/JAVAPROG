
import java.util.Stack;

public class c {
    public static void main(String[] args){
        int a[][]={{0,1,1,1,1},{1,0,0,1,0},{0,0,0,1,0},{0,0,0,0,0},{0,1,0,1,0}};
        int n=a.length;

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            st.push(i);
        }

        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();

            if(a[i][j]==1){
                st.push(j);
            }else{
                st.push(i);
            }
        }

        int pot=st.pop();

        for(int i=0;i<a.length;i++){
            if(i!=pot){
                if(a[i][pot]==0 || a[pot][i]==1){
                    System.out.println("not potemtial");
                    return;
                }
            }
        }

        System.out.println("the celebrity solution is -->"+pot);

    }    
}