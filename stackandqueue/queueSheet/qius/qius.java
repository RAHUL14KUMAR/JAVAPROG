import java.util.Scanner;
import java.util.Stack;

class queue{
    Stack<Integer> in;
    Stack<Integer> ou;
    queue(){
        in=new Stack<>();
        ou=new Stack<>();
    }

    void add(int val){
        while(!in.isEmpty()){
            ou.push(in.pop());
        }
        in.push(val);
        while(!ou.isEmpty()){
            in.push(ou.pop());
        }
    }
    void top(){
        if(in.isEmpty()){
            System.out.println("no element in the queue");
            return;
        }
        System.out.println(in.peek());
    }
    void remove(){
        if(in.isEmpty()){
            System.out.println("no element in the queue");
            return;
        }
        int rem=in.pop();
        System.out.println("remove element is "+rem);
    }
}
public class qius {
    public static void main(String[] args){
        queue q=new queue();
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.println("1. add");
            System.out.println("2. remove");
            System.out.println("3. top");
            System.out.println("4. exit");

            System.out.println("enter your choice");
            int ch=input.nextInt();

            switch(ch){
                case 1:
                    System.out.println("enter the element to add");
                    int val=input.nextInt();
                    q.add(val);
                    break;

                case 2:
                    q.remove();
                    break;

                case 3:
                    q.top();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }    
        }
    }
}