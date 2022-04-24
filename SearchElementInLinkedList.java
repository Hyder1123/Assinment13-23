public class SearchElementInLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static class LinkedList{
         void insertion(int data){
             Node newNode = new Node(data);
             if(head == null){
                 head = newNode;
                 return;
             }
             Node temp = head;
             while(temp.next!=null){
                 temp = temp.next;
             }
             temp.next = newNode;
         }
         int search(int key){
             if(head == null){
                 return -1;
             }
             Node temp = head;
             int count = 1;
             while(temp!=null){
                 if(temp.data == key){
                     return count;
                 }
                 temp = temp.next;
                 count++;
             }
             return -1;

         }

    }
    public static void main(String args[]){
        LinkedList obj = new LinkedList();
        obj.insertion(2);
        obj.insertion(4);
        obj.insertion(1);
        obj.insertion(3);
        obj.insertion(8);
        obj.insertion(5);
        System.out.println(obj.search(3));
    }
    
}
