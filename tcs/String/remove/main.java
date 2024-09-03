import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        String arr[]=inp.split(" ");
        remove(arr);
    }
    public static void remove(String arr[]){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String a=arr[i];
            char b[]=a.toCharArray();
            for(int j=0;j<b.length;j++){
                if(b[j]>=65 && b[j]<=90 || b[j]>=97 && b[j]<=122){
                    sb.append(b[j]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
