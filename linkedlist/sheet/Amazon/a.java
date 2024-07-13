public class a {
    public static class ListNode{
        int val;
        ListNode next;
    }
    public static class LinkedList{
        int size;
        ListNode head;

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

        void reverse(){
            ListNode prev=null;
            ListNode curr=head;
            while(curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;

            System.out.println("after reversing\n");
            display();
        }

        void addOne(){
            ListNode temp=head;
            int carry=0;
            int val=1;
            ListNode prev=head;
            while(prev.next!=null){
                prev=prev.next;
            }
            while(temp!=null){
                int value=val+carry+temp.val;
                if(value>=9){
                    temp.val=value%10;
                }else{
                    temp.val=value;
                }
                carry=value/10;
                val=0;

                temp=temp.next;
            }

            if(carry>0){
                ListNode temp1=new ListNode();
                temp1.val=carry;
                temp1.next=null;
                prev.next=temp1;
                size++;
            }

            reverse();
            System.out.println("after adding one\n");
            display();
        }
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.add(9);
        ll.add(9);
        ll.add(9);

        ll.display();
        ll.reverse();
        ll.addOne();

        // ll.reverse();
        // ll.display();
    }
}
