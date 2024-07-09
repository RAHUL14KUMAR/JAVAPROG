
public class r {
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

        void reverse(){
            ListNode prev=null;
            ListNode curr=head;

            while(curr!=null){
                ListNode newNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=newNode;
            }
            head=prev;
        }

        void display(){
            ListNode temp=head;

            while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        LinkedList l=new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.display();

        l.reverse();
        l.display();
    }
}
