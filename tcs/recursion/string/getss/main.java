import java.util.*;
public class main {
    public static void main(Strng args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        ArrayList<String> ans=getss(s);
    }
    public static ArrayList<String> getss(String res){
        if(res.length()==0){
            ArrayList<String> r=new ArrayList<>();
            r.add("");
            return r;
        }

        char ch=res.charAt(0);
        String ros=res.substring(1);
    }
}
