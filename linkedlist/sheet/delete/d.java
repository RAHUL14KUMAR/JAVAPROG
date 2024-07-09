import java.util.Scanner;

public class d {
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
            System.out.println();
        }

        void remove(int index){
            int s=size;
            ListNode temp=head;
            if(index==0){
                removeFirst();
            }else if(index==size){
                removeLast();
            }else{
                while(index-1>0){
                    temp=temp.next;
                    index--;
                }
                temp.next=temp.next.next;
                size--;
            }
        }

        void removeLast(){
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }
        void removeFirst(){
            head=head.next;
            size--;
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        l.display();

        System.out.println("enter the index and we remove the element from the end");
        int index=sc.nextInt();

        l.remove(index);
        l.display();
    }
}
