public class v {
    public static void main(String[] args){
        String a="1.10.02";
        String b="1.12.01";

        String v1[]=a.split("\\.");
        String v2[]=b.split("\\.");
        for (int i=0; i < Math.max(v1.length, v2.length); i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) System.out.println("-1");;
            if (num1 > num2) System.out.println("1");;
        }
        // return 0;
        System.out.println("0");
    }
}
