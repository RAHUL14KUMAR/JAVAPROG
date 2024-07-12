import java.util.*;
public class threesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size and value in the aay\n");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(a[i], a[j], a[k]);
                    list.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && a[j] == a[j - 1]) j++;
                    while (j < k && a[k] == a[k + 1]) k--;
                }
            }}

        for (List<Integer> it : list) {
            System.out.print("[ ");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }
}
