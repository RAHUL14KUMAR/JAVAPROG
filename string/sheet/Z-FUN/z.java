public class z {
    public static void main(String []args){
        String a="sadbutsad";
        String b="sad";

        int i=0;
        int j=b.length()-1;

        int index=-1;
        while(j+1<=a.length()){
            String find=a.substring(i,j+1);
            if(find.equals(b)){
                index=i;
                break;
            }
            j++;
            i++;
        }
        System.out.println(index);
    }
}
