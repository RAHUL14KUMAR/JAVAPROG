import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int b[]=new int[2];
        b[0]=a[n-2];
        b[1]=a[1];
        return b;
    }
}