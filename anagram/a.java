import java.util.*;
public class a {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hmap = new HashMap<>();
        String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        for (String w : s) {
            int[] a = convertToIntegerArray(w);
            String key=Arrays.toString(a);
            System.out.println("key "+key);
            if (!hmap.containsKey(key)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(w);
                hmap.put(key, list);
            } else {
                ArrayList<String> list=hmap.get(key);
                list.add(w);
                hmap.remove(key);
                hmap.put(key,list);
            }
        }

        ArrayList<List<String>> list=new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : hmap.entrySet()) {
            pfal(entry.getValue());
            System.out.println();
            list.add(entry.getValue());
        }
    }

    public static int[] convertToIntegerArray(String s){
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        return a;
    }

    public static void pfal(ArrayList<String> list ){
        System.out.print("[ ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(" ]");
    }
}
