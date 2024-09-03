import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        removeSplit(inp);
    }
    public static void removeSplit(String inp){
        StringBuilder sb=new StringBuilder();
        inp.trim();
        String a[]=inp.split(" ");

        for(int i=0;i<a.length;i++){
            sb.append(a[i]);
        }

        System.out.println(sb.toString());
    }
}
