package ex.example.linear;

/* 
 * 선입 후출
 * 
 * pop
 * push
 * peek : 마지막 데이터 확인
 * isEmpty : 비어있는지 확인
 */

/**
 * InnerStack
 */
class StackCls {
    int top;
    int size;
    int[] stack;

    StackCls(int size){
        this.top = -1;
        this.size = size;
        this.stack = new int[size];
    }

    protected void push(int value){
        stack[++top] = value;
    }

    protected void pop(){
        top--;
    }

    protected int peek(){
        return stack[top];
    }

    protected void printStack(){
        for(int i = 0; i < top; i++){
            System.out.print(stack[i] + " -> ");
        }
        System.out.println(stack[top]);
    }

    protected void isFull(){
        boolean isFull = this.top+1 == this.size;
        System.out.println("isFull : " + isFull);
    }

    // int top;
	// int[] stack;
	// int size;

	// public StackCls(int size) {
	// 	top = -1;
	// 	stack = new int[size];
	// 	this.size = size;
	// }

	// public int peek() {
	// 	return stack[top];        
	// }

	// public void push(int value) {
	// 	stack[++top] = value;
	// }

	// public int pop() {
	// 	return stack[top--];
	// }

	// public void printStack() {
	// 	for (int i = top; i >= 1; i--){
    //         System.out.print(stack[i] + " -> ");
    //     }
    //     System.out.println(stack[0]);
	// 	System.out.println("-- END OF LIST --");
	// }
} 

public class Stack {
    public static void main(String[] args) {
        StackCls cls = new StackCls(7);
        cls.push(5);
        cls.push(6);
        cls.push(7);
        cls.push(3);
        cls.push(2);
        cls.push(1);
        cls.push(3);
        cls.printStack();
        cls.isFull();
        cls.pop();
        cls.printStack();
        cls.isFull();
    }
}