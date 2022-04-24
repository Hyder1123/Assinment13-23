import java.util.*;

public class DeleteNodeGreaterThanElementX {
    
    static class Node{
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
            Node newNode  = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }

            curr.next = newNode;
        }

        void display(){
            if(head==null){
                return;
            }
            Node curr = head;
            while(curr!=null){
                System.out.print(curr.data+" -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }

        void deleteGreaterThanFourty(){

            if(head == null){
                return;
            }
            if(head.data>40 && head.next == null){
                head = null;
                return;
            }

            while(head.data>40 && head.next!=null){
                head = head.next;
            }

            Node prev = head;
            Node curr = head;
            while(curr!=null){
                if(curr.data>40){
                    prev.next = curr.next;
                    curr = prev.next;
                }
                else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
    }

    public static void main(String args[]){

        Link obj = new Link();
        int n = 10;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        obj.display();
        obj.deleteGreaterThanFourty();
        obj.display();
    }
}
