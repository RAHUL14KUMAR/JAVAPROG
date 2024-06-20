public class de {
    public static void main(String[] args) {
        int a[]={1,2,3,2,4};
        boolean isVisited[]=new boolean[a.length];
        
        for(int i=0;i<a.length;i++){
            int num=a[i];
            if(!isVisited[num-1]){
                isVisited[num-1]=true;
            }else{
                System.out.println("Duplicate number is "+num);
                return;
            }
        }
    }
}
