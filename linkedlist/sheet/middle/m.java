
public class m {
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

        void middle(){
            ListNode slow=head;
            ListNode fast=head;

            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            if(size%2==0){
                System.out.println("the mid of the linked list "+slow.next.val);
            }else{
                System.out.println("the mid of the linked list "+slow.val);
            }
        }
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        l.display();
        l.middle();
    }
}
