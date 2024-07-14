
import java.util.Arrays;

public class p {
    public static void main(String[] args){
        String s1="ab";
        String s2="ddecba";

        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        int frq2[]=new int[26];
        int i=0;
        int j=0;
        while(j<s2.length()){
            
            System.out.println("j "+j+" i "+i);
            while(j-i+1!=s1.length()){
                frq2[s2.charAt(j)-'a']++;
                j++;
            }

            if(j<s2.length())
            frq2[s2.charAt(j)-'a']++;

            if(Arrays.equals(freq,frq2)){
                System.out.println("permutation of the array are found");
                return;
            }else{
                frq2[s2.charAt(i)-'a']--;
                i++;
                j++;
            }
        }
        System.out.println("permutation of the array are not found");
    }
}
