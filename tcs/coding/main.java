import java.util.*;
public class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();

        int cnt=0;
        int gap=0;

        while (gap>=0) { 
            int n1move;
            if(cnt==0){
                n1move=n1+x;
            }else{
                n1move=n1+gap;
            }

            gap=n1move-n2;
            if(gap<0){
                cnt++;
                break;
            }else if(gap>=0){
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println(-1);
            return;
        }
        System.out.println("cnt "+cnt);
    }
}
