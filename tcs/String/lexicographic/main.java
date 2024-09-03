import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        lexicoString(inp);
    }
    public static void lexicoString(String inp){
        inp.trim();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<inp.length();i++){
            char ch=inp.charAt(i);

            if(ch>='a' && ch<='z'){
                int val=ch-'a';
                val=val+1;
                if(val>=25){
                    sb.append('a');
                }else{
                    sb.append((char)(ch+1));
                }
            }else{
                int val=ch-'A';
                val=val+1;
                if(val>=25){
                    sb.append('A');
                }else{
                    sb.append((char)(ch+1));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
