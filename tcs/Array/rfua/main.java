import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
         
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        ArrayList<Integer> al=new ArrayList<>();
        al.add(a[0]);

        for(int i=0;i<size;i++){
            if(al.contains(a[i])){
                continue;
            }else{
                al.add(a[i]);
            }
        }

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        System.out.println("size of the new array"+al.size());
    }
}
