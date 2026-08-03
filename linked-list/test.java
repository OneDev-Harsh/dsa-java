public class test{

    static class Node{
        int data;
        Node next;

        Node(int data1, Node next1){
            this.data=data1;
            this.next=next1;
        }

        Node(int data1){
            this.data=data1;
            this.next=null;
        }
    }

    static Node arr2LL(int arr[]){
        if(arr==null||arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node removeHead(Node head){
        Node temp=head;
        temp=temp.next;
        return temp;
    }

    static Node removeTail(Node head){
        if(head==null||head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    static Node removeKthNode(Node head, int k){
        Node temp=head;
        int x=1;
        Node hold = new Node(x);
        while(temp.next!=null){
            if(x==k){
                hold=temp.next;
            }
            x++;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node head = arr2LL(arr);
        printLL(head);
        head=removeHead(head);
        printLL(head);
        head=removeTail(head);
        printLL(head);
        head=removeKthNode(head, 5);
        printLL(head);
    }
}