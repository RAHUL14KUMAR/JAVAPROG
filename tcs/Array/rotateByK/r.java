package tcs.Array.rotateByK;
public class r {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int k=2;
        int n=a.length;
        rotate(a,k);
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

    public static void rotate(int a[],int k){
        if(k>a.length){
            k=k%a.length;
        }else if (k<0){
            k=k+a.length;
        }

        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a, 0,a.length-1);
    }

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
