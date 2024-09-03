import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String inp=sc.nextLine();

        removeVowles(inp);
    }
    public static void removeVowles(String inp){
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        String arr[]=inp.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++){
            String ask=arr[i];
            char c[]=ask.toCharArray();
            String temp= newString(c,vowels);
            if(temp==""){
                continue;
            }
            ans=ans+temp+" ";
        }

        System.out.println(ans);
    }

    public static String newString(char c[],char vowels[]){
        String ans="";
        for(int i=0;i<c.length;i++){
            boolean flag=false;
            for(int j=0;j<vowels.length;j++){
                if(c[i]==vowels[j]){
                    flag=true;
                }
            }
            if(flag==false){
                ans=ans+c[i];
            }
        }
        return ans;
    }
}
