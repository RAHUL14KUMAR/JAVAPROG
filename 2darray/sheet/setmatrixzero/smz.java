public class smz {
    public static void main(String[] args) {
        int m[][]={
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        int rows[]=new int[1000];
        int cols[]=new int[1000];
        int k=0;

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    rows[k]=i;
                    cols[k]=j;
                    k++;
                }
            }
        }
        int i=0;
        while(i<k){
            setzerorow(m,rows[i]);
            setzerocol(m,cols[i]);
            i++;
        }
    
        printarray(m);
        
    }
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setzerorow(int m[][],int row){
        for(int i=0;i<m[0].length;i++){
            m[row][i]=0;
        }
    }
    public static void setzerocol(int m[][],int col){
        for(int i=0;i<m.length;i++){
            m[i][col]=0;
        }
    }
}
