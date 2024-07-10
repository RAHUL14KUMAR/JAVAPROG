public class c {
    public static class ListNode{
        int val;
        ListNode next;
    }
    public static class LinkedList{
        ListNode head;
        int size;

        // add element in the circular linked list
        void add(int val){
            ListNode temp=new ListNode();
            temp.val=val;
            temp.next=null;

            if(size==0){
                head=temp;
                head.next=head;
                size++;
            }else{
                ListNode temp1=head;
                while(temp1.next!=head){
                    temp1=temp1.next;
                }
                temp1.next=temp;
                temp.next=head;
            }
        }

        void display(){
            ListNode temp=head;
            while(temp.next!=head){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println(temp.val);
            System.out.println("here is our linked list cycle start ->"+temp.next.val);
        }

        void detectCycle(){
            ListNode slow=head;
            ListNode fast=head;

            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    System.out.println("Cycle detected");
                    break;
                }
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

        l.display();
        l.detectCycle();
    }
}
