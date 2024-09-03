import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String pos=sc.nextLine();

        if(inp.contains(pos)){
            System.out.println("Yes the pos string is present in the given string");
        }else{
            System.out.println("No the pos string is not present in the given string");
            return;
        }

        int index=inp.indexOf(pos);
        System.out.println("The index of the pos string is "+index);
    }
}
