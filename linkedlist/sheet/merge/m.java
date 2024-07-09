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
    }
    public static void main(String[] args){
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();

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
        l2.add(55);
        l2.add(59);
        l2.add(65);


        merge(l1,l2);

    }

    public static void merge(LinkedList a,LinkedList b){
        ListNode left1=a.head;
        ListNode left2=b.head;

        LinkedList result=new LinkedList();

        while(left1!=null && left2!=null){
            if(left1.val<left2.val){
                result.add(left1.val);
                left1=left1.next;
            }else{
                result.add(left2.val);
                left2=left2.next;
            }
        }

        while(left1!=null){
            result.add(left1.val);
            left1=left1.next;
        }

        while(left2!=null){
            result.add(left2.val);
            left2=left2.next;
        }

        result.display();
    }
}
