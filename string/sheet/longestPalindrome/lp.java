

public class lp {
    public static void main(String[] args) {
        String s="abccbc";
        boolean a[][]=new boolean[s.length()][s.length()];

        int len=0;
        String ans="";

        for(int gap=0;gap<s.length();gap++){
            for(int i=0,j=gap; j<s.length();i++,j++){
                if(gap==0){
                    a[i][j]=true;
                    System.out.println(s.substring(i,j+1));
                }else if(gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        a[i][j]=true;
                        System.out.println(s.substring(i,j+1));
                    }else{
                        a[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && a[i+1][j-1]==true){
                        a[i][j]=true;
                        System.out.println(s.substring(i,j+1));
                    }else{
                        a[i][j]=false;
                    }
                }
                if(a[i][j]){
                    len=gap+1;
                    ans=s.substring(i, j+1);
                }
            }

        }
        System.out.println(len);
        System.out.println("finally---->"+ans);
    }
}
