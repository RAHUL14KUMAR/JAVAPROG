import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp1=sc.nextLine();
        String inp2=sc.nextLine();

        inp1.toLowerCase();
        inp2.toLowerCase();

        isAnagram(inp1,inp2);
    }
    public static void isAnagram(String inp1,String inp2){
        inp1.trim();
        inp2.trim();

        int freq1[]=new int[26];
        for(int i=0;i<inp1.length();i++){
            char ch=inp1.charAt(i);
            freq1[ch-'a']++;
        }

        int freq2[]=new int[26];
        for(int i=0;i<inp2.length();i++){
            char ch=inp2.charAt(i);
            freq2[ch-'a']++;
        }

        if(Arrays.equals(freq1,freq2)==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
