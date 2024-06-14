import java.util.*;
public class wt {
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

        // wave traversal
        for(int i=0;i<cols;i++){
            if(i%2==0){
                // move upto down with increment of one column
                for(int j=0;j<rows;j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();

            }else{
                // move down to up with incremment of one clumn
                for(int j=rows-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}
