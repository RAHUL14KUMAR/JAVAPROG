import java.util.*;
public class lcp {
    public static void main(String[] args) {
           String s[]={"flower","flow","flight"};
        //    s={"flight","flow","flower"}
           Arrays.sort(s);

           String a=s[0];
           String b=s[s.length-1];

           int ind1=0;
           int ind2=0;
           int count=0;

           while(ind1<a.length() && ind2<b.length()){
                if(a.charAt(ind1)==b.charAt(ind2)){
                    count++;
                }else{
                    break;
                }
                ind1++;ind2++;
           }

           System.out.println(a.substring(0,count));
    }
}
