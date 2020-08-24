package ex.example.linear;

/* 
 * 선입 선출
 */

class QueueCls{
    private int front; // 가장 첫 원소
    private int rear; // 가장 끝 원소
    private int maxSize;
    private int[] queue;

    QueueCls(int maxSize){
        this.maxSize = maxSize;
        this.front = 0; 
        this.rear = -1; 
        this.queue = new int[maxSize];
    }

    protected void peek(){
        System.out.println(queue[front]);
    }

    protected void isFull(){
        System.out.println("isFull : " + ( rear+1 == maxSize ));
    }

    protected void isEmpty(){
        System.out.println("isEmpty : " + (front == rear +1));
    }

    protected void insert(int data){
        queue[++rear] = data;
    }

    protected void remove(){
        front++;
    }

    protected void printStack(){
        for(int i = front; i < rear; i++){
            System.out.print(queue[i] + " -> ");
        }
        System.out.println(queue[rear]);
    }
}

public class Queue {
    public static void main(String[] args) {
        // array 로 만들시 단점 : maxSize를 넘지 못한다.
        QueueCls cls = new QueueCls(10);
        cls.insert(3);
        cls.insert(2);
        cls.insert(1);
        cls.insert(4);
        cls.insert(5);
        cls.insert(6);
        cls.insert(7);
        cls.insert(8);
        cls.printStack();
        cls.peek();
        cls.remove(); //  최초 3이 제거 됨
        cls.insert(8);
        
        cls.printStack();
    }
}