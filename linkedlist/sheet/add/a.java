public class a {
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
                removeLast();
            }else if(index==size){
                removeFirst();
            }else{
                while(s-1>index){
                    temp=temp.next;
                    s--;
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
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        // LinkedList res=new LinkedList();

        // add value in the first linkedlist
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);

        // add value int he second linkedlist
        l2.add(5);
        l2.add(9);
        l2.add(15);
        l2.add(19);
        l2.add(25);
        l2.add(49);
        
        addTwoLinkedList(l1,l2);
    }
    public static void addTwoLinkedList(LinkedList l1,LinkedList l2){
        ListNode left1=l1.head;
        ListNode left2=l2.head;

        LinkedList result=new LinkedList();
        if(l1.size!=l2.size){
            System.out.println("the list size must be remain same");
            return;
        }
        int carry=0;
        while(left1!=null){
            int res=left1.val+left2.val+carry;
            if(res>9){
                result.add(res%10);
                carry=res/10;
            }else{
                result.add(res);
                carry=0;
            }
            left1=left1.next;
            left2=left2.next;
        }
        if(carry>0){
            result.add(carry);
        }
        result.display();
    }
}
