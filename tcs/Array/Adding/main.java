import java.util.*;

public class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        a=insertInTheBegining(6,a);
        print(a);
        a=insertAtTheEnd(7,a);
        print(a);
        a=insertAtAnyIndex(8,4,a);
        print(a);
    }

    public static int[] insertInTheBegining(int x,int a[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(x);
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }

        a=new int[a.length+1];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
    }
    public static int[] insertAtTheEnd(int x,int a[]){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }
        al.add(x);

        a=new int[a.length+1];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
    } 

    public static int[] insertAtAnyIndex(int x,int ind,int a[]){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(i==ind-1){
                al.add(x);
            }
            al.add(a[i]);
        }

        a=new int[a.length+1];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
