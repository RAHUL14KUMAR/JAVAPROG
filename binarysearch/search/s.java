
public class s {
    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
        int l=0;
        int h=6;
        int k=0;

        while(l<h){
            int m=(l+h)/2;

            if(a[m]==k){
                System.out.println("mid "+m);
                return ;
            }

            if(a[l]<=a[m]){
                if(a[l]<=k && k<=a[m]){
                    h=m-1;
                }else{
                    l=m+1;
                }

            }else{
                if(a[m+1]<=k && k<=a[h]){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }

        System.out.println("the target not present");
    }
}
