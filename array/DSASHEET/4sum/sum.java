import java.util.*;
public class sum {
    public static void main(String[] args) {
        int a[]={-2,-1,0,0,1,2}; 
        int target=0;
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<a.length;i++){

            if(i>0 && a[i]==a[i-1]){
                continue;
            }   
            for(int j=i+1;j<a.length;j++){
                if(j>i+1 && a[j]==a[j-1]){
                    continue;
                }

                int left=j+1;
                int right=a.length-1;

                while(left<right){
                    int sum=a[left]+a[right]+a[j]+a[i];
                    if(sum==target){
                        ArrayList<Integer> al=new ArrayList<>();
                        al.add(a[i]);
                        al.add(a[j]);
                        al.add(a[left]);
                        al.add(a[right]);
                        list.add(al);
                        left++;
                        right--;

                        while(left<right && a[left]==a[left-1]){
                            left++;
                        }
                        while(right>left && a[right]==a[right+1]){
                            right--;
                        }
                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        for (List<Integer> it : list) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
