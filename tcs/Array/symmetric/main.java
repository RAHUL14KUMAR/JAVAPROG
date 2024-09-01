import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int fir=arr[i][0];
            int sec=arr[i][1];

            if(hmap.get(sec)!=null && hmap.get(sec)==fir){
                System.out.println("[ "+fir+","+sec+" ]");
            }else{
                hmap.put(fir,sec);
            }
        }
    }    
}
