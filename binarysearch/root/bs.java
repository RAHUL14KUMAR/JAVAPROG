public class bs {
    public static void main(String args[]){
        int n=3;
        int m=28;

        int low=1;
        int high=27;

        while(low<=high){
            int mid=(low+high)/2;
            System.out.println("mid in the fun->"+mid);

            int fun=func(mid,n,m);
            if (fun == 1) {
                System.out.println(mid);
                return;
            } else if (fun == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
    public static int func(int mid, int n, int m) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
}
