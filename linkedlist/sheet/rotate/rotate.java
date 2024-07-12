import java.util.*;
public class rotate {
    public static class ListNode{
        int val;
        ListNode next;
    }

    public static class LinkedList{
        ListNode head;
        int size;

        void add(int val){
            ListNode temp=new ListNode();
            temp.val=val;
            temp.next=null;

            if(size==0){
                head=temp;
                size++;
            }else{
                ListNode temp1=head;
                while(temp1.next!=null){
                    temp1=temp1.next;
                }
                temp1.next=temp;
                size++;
            }
        }

        void display(){
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the rotation number\n");
        int k=sc.nextInt();

        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("before rotation");
        list.display();

        rotateList(list,k);
    }
    public static void rotateList(LinkedList l1,int k){

        LinkedList temp1=new LinkedList();
        LinkedList temp2=new LinkedList();

        int size=l1.size;
        if(k>size){
            k=k%size;
        }
        int rem=size-k;

        ListNode curr=l1.head;
        while(rem>0){
            temp1.add(curr.val);
            curr=curr.next;
            rem--;
        }

        while(curr!=null){
            temp2.add(curr.val);
            curr=curr.next;
        }
        
        // print temp2 value 
        System.out.println("the first linkedlist value printed!!!");
        temp1.display();

        System.out.println("the second linkedlist value printed!!!");
        printLL(temp2);

        process(temp1,temp2);
        
        System.out.println("after rotation");
        printLL(temp2);
    }

    public static void printLL(LinkedList l){
        ListNode temp=l.head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

    public static void process(LinkedList l1,LinkedList l2){
        ListNode temp=l2.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=l1.head;
    }
}
