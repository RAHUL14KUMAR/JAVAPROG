import java.util.*;
public class main {
    public static void main(String args[]){
        int a[]={0,1,2};
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(a[0]);
        ans.add(a[1]);
        ans.add(a[2]);

        subsetSum(ans,ans.size());
    }

    public static void subsetSum(ArrayList<Integer> ans,int size){
        ArrayList<Integer> res=new ArrayList<>();
        // ArrayList<Integer> res2=new ArrayList<>();
        // ArrayList<ArrayList<Integer>> res3=new ArrayList<>();

        genss(0,0,res,ans,size);
        Collections.sort(res);
        for(Integer sum:res){
            System.out.print(sum+" ");
        }
        System.out.println();
        // for(ArrayList<Integer> a:res3){
        //     System.out.print(a+" ");
        // }
    }

    public static void genss(int ind, int sum, ArrayList<Integer> res, ArrayList<Integer> ans, int size) {
        if (ind == size) {
            res.add(sum);
            // res3.add(new ArrayList<>(res2));
            return;
        }
        // res2.add(ans.get(ind));
        genss(ind + 1, sum + ans.get(ind), res, ans, size);
        res.remove(res.size() - 1);
        genss(ind + 1, sum, res, ans, size);
    }
}