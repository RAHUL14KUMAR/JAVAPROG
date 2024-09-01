import java.util.*;
public class main {
    public static void Main(String args[]){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();

        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<size;i++){
            if(a[i]==a[i-1]){
                al.add(a[i]);
            }
        }
    }
}
