public class re {
    public static void main(String []args){
        int a =5;
        int power=8;

        int ans=pow(a,power);
        System.out.println(ans);
    }
    public static int pow(int a,int power){
        if(power ==0){
            return 1;
        }

        return a*pow(a,power-1);
    }
}
