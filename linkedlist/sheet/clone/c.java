//  aage dekhna hai
public class c {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode random;
    }

    public static class LinkedList{
        int size;
        ListNode head;
    }
    public static void main(String[] args){
        Integer a[][]={
            {7,null},
            {13,0},
            {11,4},
            {10,2},
            {1,0}
        };

        // System.out.println("hello");

        LinkedList ll=new LinkedList();
        add(ll,a);
        setRandomPointer(ll,a);
        print(ll);

    }
    public static void add(LinkedList ll,Object a[][]){
        for(int i=0;i<a.length;i++){
            int val=(int)a[i][0];
            ListNode temp=new ListNode();
            temp.val=val;
            temp.next=null;

            if(ll.size==0){
                ll.head=temp;
                ll.size++;
            }else{
                ListNode temp1=ll.head;
                while(temp1.next!=null){
                    temp1=temp1.next;
                }
                temp1.next=temp;
                ll.size++;
            }
        }    
    }
    public static void setRandomPointer(LinkedList ll,Integer a[][]){
        for(int i=0;i<a.length;i++){
            int val = (a[i][1] != null) ? a[i][1] : -1;
            ListNode temp=new ListNode();
            temp.val=val;
            temp.next=null;
            temp.random=null;

            if(val==-1){
                temp.random.val=-1;
            }else{
                ListNode temp1=ll.head;
                int j=0;
                while(j<val){
                    temp1=temp1.next;
                    j++;
                }
                temp.random.val=temp1.val;
            }
            
        }    
    }
    public static void print(LinkedList ll){
        ListNode temp=ll.head;
        while(temp!=null){
            System.out.print("["+temp.val+","+temp.random.val+"] ");
            temp=temp.next;
        }
        System.out.println();
    }
}