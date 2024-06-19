public class SP {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int rows=sc.nextInt();
        // int cols=sc.nextInt();

        int arr[][]={
            {14 ,13 ,12 ,11}, 
            {24 ,23 ,22 ,21},
            {34 ,33 ,32 ,31},
            {44 ,43 ,42 ,41}
        };
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        printarray(arr);
        System.out.println();

        for(int i=0;i<arr.length;i++){
            int min=0;int max=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][min]){
                    min=j;
                }
            }

            System.out.println("min "+min);

            for(int k=0;k<arr.length;k++){
                if(arr[i][min]<arr[k][min]){
                    max=k;
                }
            }
            System.out.println("max "+max);

            if(arr[i][min]==arr[min][max]){
                System.out.println(arr[min][max]);
            }
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
