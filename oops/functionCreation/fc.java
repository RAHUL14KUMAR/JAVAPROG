public class fc {
   public static void main(String[] args){
        int fn=23;
        int sn=24;
        int res=maxOf(fn,sn);
        System.out.println(res);
   } 
   public static int maxOf(int a,int b){
        if(a>b){
            return a;
        }
        return b;
   }
}
