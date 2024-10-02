import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            al.add(a);
        }

        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            al2.add(a);
        }

        merge(al,al2);
    }

    public static void merge(ArrayList<Integer> al,ArrayList<Integer> al2){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<al.size() && j<al2.size()){
            if(al.get(i)<al2.get(j)){
                list.add(al.get(i));
                i++;
            }else{
                list.add(al2.get(j));
                j++;
            }
        }

        while(i<al.size()){
            list.add(al.get(i));
            i++;
        }

        while(j<al2.size()){
            list.add(al2.get(j));
            j++;
        }

        print(list);

    }

    public static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
