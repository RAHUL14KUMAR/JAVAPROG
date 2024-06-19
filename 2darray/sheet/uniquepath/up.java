public class up {
    public static void main(String[] args) {
        int m=2;
        int n=3;

        int arr[][]=new int[m][n];
        int a=cntPath(arr,0,0,m,n);
        System.out.println(a);
        
    }

    public static int cntPath(int arr[][],int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }

        if(i>=m || j>=n){
            return 0;
        }
        return cntPath(arr,i+1,j,m,n)+
        cntPath(arr,i,j+1,m,n);    
    }

}
