import java.util.*;
public class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        countVowelsConsonantsAndSpaces(inp);
    }

    public static void countVowelsConsonantsAndSpaces(String input){
        int v=countVowels(input);
        int c=countConsonants(input);
        // countSpaces(input);

        System.out.println("vowels count-> "+v); 
        System.out.println("consonants count ->"+c); 
        System.out.println("space count ->"+(input.length()-v-c));
    }

    public static int countVowels(String input){
        String arr[]=input.split(" ");
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        int v=0;
        for(int i=0;i<arr.length;i++){
            String ask=arr[i];
            char c[]=ask.toCharArray();

            int a=checkCinVowels(c,vowels);
            v=v+a;
        }
        return v;
    }

    public static int checkCinVowels(char c[],char vowels[]){
        int cnt=0;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<vowels.length;j++){
                if(c[i]==vowels[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int countConsonants(String input){
        String arr[]=input.split(" ");
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        int v=0;
        for(int i=0;i<arr.length;i++){
            String ask=arr[i];
            char c[]=ask.toCharArray();

            int a=checkCinVowels(c,vowels);
            v=v+c.length-a;
        }
        return v;
    }
}
