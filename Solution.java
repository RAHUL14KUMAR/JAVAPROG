import java.util.*;

public class Solution {
public static void solve(int N, int M, int K, int[] arr) {
    Arrays.sort(arr);

    int score = 0;
    System.out.println("arr "+Arrays.toString(arr));

    for (int i = 0; i <N; i++) {
        // int a=N-1;
        // int b= a-i;
        System.out.println("n-i-1->"+(N-i-1));
        int avgScore = (i== 0) ? 0 : score / (i);
        System.out.println("avgScore-> "+avgScore);

        if (avgScore <= arr[i]) {
            score += M;
        }
        System.out.println("score ->"+score);
    }

    if (score == K) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}

public static void main(String[] args) {
    int m=10;
    int k=30;
    int n=5;
    int a[]={1 ,0 ,1 ,8 ,5};
    solve(n,m,k,a);
}
}