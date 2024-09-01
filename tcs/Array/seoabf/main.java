import java.util.*;
class Interval{
    int val;
    int freq; 
}
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=8;

        int a[]={1,2,3,2,4,3,1,2};
        // for(int i=0;i<size;i++){
        //     a[i]=sc.nextInt();
        // }
        Arrays.sort(a);

        ArrayList<Interval> list=new ArrayList<>();   
        int fre=1;
        for(int i=1;i<size;i++){
            if(a[i]==a[i-1]){
                fre++;
            }else{
                Interval inter=new Interval();
                inter.val=a[i-1];
                inter.freq=fre;
                list.add(inter);

                fre=1;
            }
        }

        Interval inter=new Interval();
        inter.val=a[size-1];
        inter.freq=fre;
        list.add(inter);

        // Collections.sort(list);
        Collections.sort(list, (an,bn)->Integer.compare(bn.freq,an.freq));
        for(int i=0;i<list.size();i++){
            while(list.get(i).freq>0){
                System.out.print(list.get(i).val+" ");
                list.get(i).freq--;
            }
        }
    }
}
