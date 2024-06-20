import java.util.*;
public class ts {
    public static void main(String[] args){
        int a[]={3,3};
        int target=6;
        boolean isVisited[]=new boolean[a.length];
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            int rem=target-a[i];

            if(rem==0){
                al.add(i);
                al.add(-1);
                isVisited[i]=true;
            }

            int c=remIsPresent(rem,a,isVisited,i);

            if(c !=0  && isVisited[i]==false){
                al.add(i);
                al.add(c);
                isVisited[i]=true;
            }
        }

        if(al.size()==0){
            al.add(-1);
            al.add(-1);
        }

        al.toArray();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
    public static int remIsPresent(int rem,int a[],boolean v[],int index){
        for(int i=0;i<a.length;i++){
            if(i!=index && v[i]==false){
                if(rem==a[i]){
                    v[i]=true;
                    return i;
                }
            }
        }
        return 0;
    }
}
