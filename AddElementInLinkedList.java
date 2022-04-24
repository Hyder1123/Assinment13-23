public class AddElementInLinkedList {

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
         void display(){
             if(head == null){
                 return;
             }
             Node temp = head;
             int count = 0;
             while(temp!=null){
                 System.out.print(temp.data+" -> ");
                 temp = temp.next;
                 count++;
                
             }
             System.out.println("null");
             System.out.println("Size of linked list = "+count);
             
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
        obj.insertion(20);
        obj.display();
    }
    
}
