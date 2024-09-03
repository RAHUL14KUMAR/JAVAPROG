import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp1=sc.nextLine();
        String inp2=sc.nextLine();

        removeCharFrom2(inp1,inp2);
    }
    public static void removeCharFrom2(String inp1,String inp2){
        StringBuilder sb=new StringBuilder();
        char a[]=inp1.toCharArray();
        char b[]=inp2.toCharArray();

        for(int i=0;i<a.length;i++){
            Boolean flag=false;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    flag=true;
                }
            }

            if(flag==false){
                sb.append(a[i]);
            }
        }

        System.out.println(sb.toString());
    }
}
