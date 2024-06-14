import java.util.*;
public class subset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println("INPUT STRING "+ s);

        String arr[]=s.split(" ");
        int limit=(int)Math.pow(2,arr.length);
        
        
        for(int i=0;i<limit;i++){
            int temp=i;
            String set="";

            for(int j=arr.length-1;j>=0;j--){
                int r=temp%2;
                temp=temp/2;

                if(r==0){
                    set=" "+set;
                }else{
                    set=arr[j]+set;
                }
            }
            System.out.println(i+" "+set);
        }
    }
}
