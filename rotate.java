public class rotate {
    public static void main(String args[]){
        int a[]={10, 20, 30, 40, 50};
        int k=2;

        if(k<0){
            k=k+a.length;
        }else if(k>a.length){
            k=k%a.length;
        }

        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);

        printArray(a);
    }
    public static void reverse(int a[],int l,int h){
        while(l<h){
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
    }

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
