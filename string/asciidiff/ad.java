public class ad {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();  
        String s="abdgca";
        sb.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            int gap=ch-s.charAt(i-1);
            sb.append(gap+" ");
            sb.append(ch);
        }
        s=sb.toString();
        System.out.println(s);
    }
}
