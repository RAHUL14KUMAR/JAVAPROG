import java.util.*;
public class main {
    public static void main(String args[]){

        String digits = "";
        String arr[]={"",";","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> str= getkpc(digits,arr);
        for(String s:str){
            System.out.println(s);
        }
    }
    public static ArrayList<String> getkpc(String dig,String arr[]){
         if(dig.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=dig.charAt(0);
        System.out.println("the character is "+ch);
        String newd=dig.substring(1);
        ArrayList<String> res=getkpc(newd,arr);

        ArrayList<String> myans=new ArrayList<>();
        String to=arr[ch-'0'];
        System.out.println("the string to attached->"+to);

        for(int i=0;i<to.length();i++){
            char toAdd=to.charAt(i);
            for(String a:res){
                myans.add(toAdd+a);
            }
        }
        return myans;
    }
}
