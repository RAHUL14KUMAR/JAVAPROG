
public class perm {
    public static void main(String[] args) {
        String s="abc";
        
        int n=s.length();
        int f=factorial(n);
        for(int i=0;i<f;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(s);
            int temp=i;

            for(int div=n;div>=1;div--){
                int q=temp/div;
                int r=temp%div;
    
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp=q;
            }
            System.out.println("");
        }
    }
    public static int factorial(int a){
        int ans=1;
        for(int i=1;i<=a;i++){
            ans=ans*i;
        }
        return ans;
    }
}
