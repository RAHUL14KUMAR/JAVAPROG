import java.util.*;
public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<int[]> ans = subset(arr);
        for (int[] subArray : ans) {
            System.out.println(Arrays.toString(subArray));
        }
    }

    public static ArrayList<int[]> subset(int[] s) {
        // if (s.length == 0) {
        //     ArrayList<int[]> result = new ArrayList<>();
        //     result.add(new int[0]);
        //     return result;
        // }
        ArrayList<int[]> result = new ArrayList<>();
        for(int i=0;i<s.length;i++){

        }
        
    }
}
