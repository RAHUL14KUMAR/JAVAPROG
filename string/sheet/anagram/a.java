
import java.util.Arrays;

public class a {
    public static void main(String[] args){
        String a="anagram";
        String b="nagaram";

        int c[]=new int[26];
        int d[]=new int[26];
        if(a.length()!=b.length()){
            System.out.println(false);
        }

        for(int i=0;i<b.length();i++){
            int val=b.charAt(i)-'a';
            c[val]=c[val]+1;
        }

        for(int i=0;i<a.length();i++){
            int val=a.charAt(i)-'a';
            d[val]=d[val]+1;
        }

        if(Arrays.equals(c,d)){
            System.out.println(true);
        }

        for(int i=0;i<26;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<26;i++){
            System.out.print(d[i]+" ");
        }
        System.out.println(false);
    }
}
