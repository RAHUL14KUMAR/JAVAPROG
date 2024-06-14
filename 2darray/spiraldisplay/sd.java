import java.util.*;
public class sd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printarray(arr);

        System.out.println();

        // spiral traversal
        int minrow=0;
        int mincol=0;

        int maxrow=arr.length-1;
        int maxcol=arr[0].length-1;

        while (true) { 
            // lw
            for(int i=minrow;i<=maxrow;i++){
                System.out.print(arr[i][mincol]+" ");
            }
            mincol++;
            System.out.println();
            // bw

            for(int i=mincol;i<=maxcol;i++){
                System.out.print(arr[maxrow][i]+" ");
            }
            maxrow--;
            System.out.println();
            // rw

            for(int i=maxrow;i>=minrow;i--){
                System.out.println(arr[i][maxcol]+" ");
            }
            maxcol--;
            System.out.println();
            // tw

            for(int i=maxcol;i>=mincol;i--){
                System.out.print(arr[minrow][i]);
            }
            minrow++;
            System.out.println();
        }
    }
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
