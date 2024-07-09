import java.util.*;
public class Main {
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
        Node temp=new Node();
        temp.data=val;
        temp.next=null;

        if(size==0){
            head=tail=temp;
            size++;
        }else{
            tail.next=temp;
            tail=temp;

            size++;
        }
    }

    void display(){
        Node temp=head;

        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
    }

    void size(){
        System.out.println(size);
    }

    void Removefirst(){
        if(size==0){
            System.out.println("List is empty");
        }else{
            head=head.next;
            size--;
        }
    }

    // get value in the linkedlist
    void get(int index){
        if(index<0 || index>=size){
            System.out.println("invalid index");
        }else{
            Node temp=head;

            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            System.out.println("th value at you index is"+temp.data);
        }
    }

    Node getNodeAt(int index){
        Node temp=head;
        if(index<0 || index>=size){
            System.out.println("invalid index");
        }else{
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }
        return temp;
    }

    // reverse the linkedlist using data itertitive
    void reverseUsingDataItertitive(){
        int li=0;
        int ri=size-1;

        while(li<ri){
            Node left=getNodeAt(li);
            Node right=getNodeAt(ri);

            int emp=left.data;
            left.data=right.data;
            right.data=emp;

            li++;
            ri--;
        }
    }

    void reverseusingPointerItertive(){
        Node prev=null;
        Node temp=head;

        while(temp!=null){
            Node newNode=temp.next;
            temp.next=prev;

            prev=temp;
            temp=newNode;
        }
    }

    void addAtAnIndex(int index,int val){
        Node temp=head;
        if(index<0 || index>size){
            System.out.println("invalid index");
        }else{
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            Node newNode=new Node();
            newNode.data=val;
            newNode.next=temp.next;
            temp.next=newNode;

            size++;
        }
    }

    void removeFirst(){
        if(size==0){
            System.out.println("List is empty");
        }else{
            head=head.next;
            size--;
        }
    }

    void removeAtAnyindex(int index){
        Node temp=head;
        if(index<0 || index>=size){
            System.out.println("invalid index");
        }else{
            if(index==0){
                removeFirst();
                size--;
            }else{
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                size--;
            }
        }
    }

    // kth node from the end of linkedlist
    void kthnodefromend(int index){
        Node start=head;
        Node fast=head;

        for(int i=0;i<index;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            fast=fast.next;
            start=start.next;
        }

        System.out.println(start.data);
    } 

    // middle of the likedlist
    void middle(){
        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println("the mid of the linked list "+slow.data);
    }

    void removeduplicatesinsortll(){
        Node temp=head;
        Node prevTemp=temp;
        Node newNode=temp.next;
        while(temp!=null){
            if(temp.data==newNode.data){
                temp=temp.next;
            }else{
                prevTemp.next=newNode;
                temp=temp.next;
                prevTemp=prevTemp.next;
                newNode=temp.next;
            }
        }
    }
}
public static void main(String[] args){
        LinkedList l=new LinkedList();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the value: ");
            int val=sc.nextInt();
            l.addLast(val);
        }

        System.out.println("here is the display of linked list and its size");
        l.display();
        l.size();

        // remove first
        System.out.println("the remove first call here done");
        l.Removefirst();
        l.display();

        // get value at an index
        System.out.println("Enter the index:  to search the value");
        int index=sc.nextInt();
        l.get(index);

        // rever using data itertaive
        System.out.println("here we can reverse the linked list using data itertitive");
        l.reverseUsingDataItertitive();
        l.display();

        System.out.println("here we can reverse the linked list using pointer itertitive");
        l.reverseusingPointerItertive();
        l.display();

        System.out.println("add a node at an index");
        l.addAtAnIndex(2,20);
        l.display();

        System.out.println("remove at any index");
        l.removeAtAnyindex(2);
        l.removeAtAnyindex(0);

        l.display();

        System.out.println("from kth node from the end");
        l.kthnodefromend(0);

        System.out.println("the midd of the linked list");
        l.middle();

        System.out.println("remove duplicates from sorted linked list");
        l.removeduplicatesinsortll();
        l.display();
    }
}    