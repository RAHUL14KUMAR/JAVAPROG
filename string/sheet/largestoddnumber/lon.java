public class lon {
    public static void main(String[] args){
        String s = "7542351161";
        long a = 0L; // Use long to hold larger values
        for (int i = 0; i < s.length(); i++) {
        a = a * 10 + (s.charAt(i) - '0');
        }
        System.out.println("Converted integer: " + a);
        
        int max=-1;
        long num=0;
        if(a%2!=0){
            System.out.print(""+a);
            return;
        }else{
            while(a!=0){
                long rem=a/10;
                num=num*10+rem;
                if(num%2!=0){
                    max=(int)Math.max(rem,max);
                }
                a=a/10;
                // System.out.println(""+max);
            }
        }

        if (max==-1) System.out.println("");
        else System.out.println(""+max);
    }
}
