package ex.example.linkedListEx.common;

public class LinkedList {
    public Node header;

    public LinkedList(){
        header = new Node();
    }
    
    public class Node{
        public int data;
        public Node next = null;
    }

    public void append(int data){
        Node end = new Node();
        end.data = data;
        Node n = header;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public void delete(int data){
        Node n = this.header;
        while(n.next != null){
            if(n.next.data == data){ 
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
    }

    public void retrieve(){
        Node n = this.header.next;
        while( n != null && n.next != null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    // 중복 제거
    public void removeDups(){
        Node n = header;
        while(n.next != null){
            Node r = n;
            while(r.next != null){
                if(n.data == r.next.data){
                    r.next = r.next.next;
                }else{
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
}