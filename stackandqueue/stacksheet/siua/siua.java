
import java.util.*;
public class siua {
    public static void main(String[] args) {
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        int cnt=0;

        while (true) { 
            System.out.println("1-> add element in the stack");
            System.out.println("2-> remove element from the stack");
            System.out.println("3-> get top value of the stack");
            System.out.println("4-> get size of the stack");
            System.out.println("5-> exit");

            System.out.println("enter your choice");
            int ch=sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("enter the element to be added");
                    int ele=sc.nextInt();
                    a[cnt]=ele;
                    cnt++;
                    break;
                case 2:
                    if(cnt==0){
                        System.out.println("stack is empty");
                    }else{
                        int rem=a[cnt-1];
                        System.out.println("the removed element is "+rem);
                        a[cnt-1]=0;
                        cnt--;
                    }
                    break;
                case 3:
                    if(cnt==0){
                        System.out.println("stack is empty");
                    }else{
                        int top=a[cnt-1];
                        System.out.println("the top element is "+top);
                    }
                    break;
                case 4:
                    int size=cnt;
                    System.out.println("the size of the stack is "+size);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}
