public class main {
    public static void main(String[] args) {
        int n = 5;
        int nums[] = { 2, 3, -1, 8, 4};
        int equilibriumidx = findEquilibriumIdx(nums, n);
        System.out.println(equilibriumidx);
    }
    public static int findEquilibriumIdx(int a[],int n){
        for(int i=0;i<n;i++){
            int ls=0;
            for(int j=0;j<i;j++){
                ls+=a[j];
            }

            int rs=0;
            for(int j=i+1;j<n;j++){
                rs+=a[j];
            }
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}
