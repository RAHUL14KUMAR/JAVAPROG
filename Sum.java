import java.util.*;

public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("number input"+n);

        // String str=sc.nextLine();
        // System.out.println("string input-> "+str);

        // char ch=sc.next().charAt(0);
        // System.out.println("char input->"+ch);

        char arr[]=new char[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.next().charAt(1);
            System.out.println("char input->"+arr[i]);
        }
    }
}