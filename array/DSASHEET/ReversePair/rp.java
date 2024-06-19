public class rp {
    public static void main(String[] args) {
        int a[]={1,3,2,3,1};
        int ans=0;

        for(int i=0;i<a.length;i++){
            int na=reversePair(a,i+1,a[i]);
            ans=ans+na;
        }
        System.out.println(ans);
    }
    public static int reversePair(int a[],int index,int element){
        int cnt=0;
        for(int i=index;i<a.length;i++){
            if(element>2*a[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
