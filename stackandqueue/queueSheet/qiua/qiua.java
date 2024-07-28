import java.util.*;

class queue{
    int data[];
    int front=0;
    int size=0;
    int rear=0;


    queue(){
        data=new int[5];
    }

    void add(int val){
        if(size==data.length-1){
            System.out.println("overflow occur");
            return;
        }
        data[size]=val;
        size++;
        rear++;
    }
    void remove(){
        if(front>rear){
            System.out.println("no element can remove from queue");
            return;
        }
        int rem=data[front];
        System.out.println("the remove element from the queue is "+rem);
        front++;
    }

    void top(){
        if(front>rear){
            System.out.println("no element in the queue");
            return;
        }
        int rem=data[front];
        System.out.println("the top element in the queue is "+rem);
    }
}
public class qiua{
    public static void main(String args[]){
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