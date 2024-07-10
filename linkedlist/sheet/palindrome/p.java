public class p {
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
    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
    
        checkPalindrome(list);
    }

    public static void checkPalindrome(LinkedList l1){
        ListNode mid=l1.head;
        ListNode fast=l1.head;
        while(fast!=null&&fast.next!=null){
           fast=fast.next.next;
           mid=mid.next;
        }
        ListNode curr=mid;
        ListNode pre=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        while(pre!=null&&l1.head!=null){
            if(pre.val!=l1.head.val){
                System.out.println("not palindrome");
                return;
            }
            pre=pre.next;
            l1.head=l1.head.next;
        }
        System.out.println("palindrome");
    }
  }
