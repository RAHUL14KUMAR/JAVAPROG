
import java.util.Scanner;

public class r {
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

        transposeArray(arr);
        printarray(arr);
        System.out.println();

        rotateArray(arr);
        printarray(arr);
    }
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeArray(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[0].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }

    public static void rotateArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int li=0;
            int ri=arr[0].length-1;

            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
}
