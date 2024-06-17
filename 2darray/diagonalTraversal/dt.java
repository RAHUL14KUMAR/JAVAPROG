import java.util.*;
public class dt {
    public static void main(String[] args){
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

        diagonalTraversal(arr);
    }
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void diagonalTraversal(int a[][]){
        for(int gap=0;gap<a.length;gap++){
            for(int i=0,j=gap;j<a[0].length;i++,j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
