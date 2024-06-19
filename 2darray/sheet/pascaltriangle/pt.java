import java.util.*;
public class pt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer>row=new ArrayList<>();
        List<Integer>prev= new ArrayList<>();

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j)+prev.get(j-1));
                }
                
            }
            prev=row;
            arr.add(row);
            row=new ArrayList<>();
        }

        print(arr);
    }
    public static void print(List<List<Integer>> arr){
        int n=arr.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+"  ");
            }
            System.out.println();
        }
    }
}
