import java.util.*;

public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        inp.trim();
        reverse(inp);
    }
    public static void reverse(String inp){
        StringBuilder sb=new StringBuilder();
        String a[]=inp.split(" ");


        for(int i=a.length-1;i>=0;i--){
            String b="";
            String ask=a[i];
            char c[]=ask.toCharArray();

            for(int j=c.length-1;j>=0;j--){
                b=b+c[j];
            }
            sb.append(b+" ");
        }

        System.out.println(sb.toString());
    }
}
