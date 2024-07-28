package stack.stacksheet.area;
import java.util.*;
public class a {
    public static void main(String[] args){
        int a[]={2,1,5,6,2,3};
        
        // next greater element right
        int nger[]=new int[a.length];
        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);
        nger[a.length-1]=a.length-1;

        for(int i=a.length-2;i>=0;i--){
            while(!st.isEmpty() && a[i]>a[st.peek()] ){
                st.pop();
            }
            if(st.isEmpty()){
                nger[i]=a.length-1;
                st.push(i);
            }else{
                nger[i]=st.peek();
                st.push(i);
            }
        }

        // next greater element left
        int ngel[]=new int[a.length];
        st=new Stack<>();
        st.push(0);
        ngel[0]=0;

        for(int i=1;i<a.length;i++){
            while(!st.isEmpty() && a[i]>a[st.peek()] ){
                st.pop();
            }
            if(st.isEmpty()){
                nger[i]=0;
                st.push(i);
            }else{
                nger[i]=st.peek();
                st.push(i);
            }
        }


        // max area histogram
        int max=0;
        for(int i=0;i<a.length;i++){
            int area=a[i]*(nger[i]-ngel[i]);
            max=Math.max(area,max);
        }

        System.out.println(max);
    }
}
