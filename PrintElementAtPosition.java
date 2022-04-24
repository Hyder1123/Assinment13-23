import java.util.*;
public class PrintElementAtPosition {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static class Link{
        void insert(int data){
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

        void print(int index){
            Node temp = head;
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public static void main(String args[]){
        int n = 10;
        Link obj = new Link();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        obj.print(5);
    }
    
}
