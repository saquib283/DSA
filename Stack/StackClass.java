package DSA.Stack;

//Stack Using Linked List
public class StackClass {
    Node head;

    class Node {    
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    boolean isempty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isempty()) {
            head = newNode; 
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {

        if (isempty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isempty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return head.data;
    }


    public static void main(String[] args) {
        StackClass s=new StackClass();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.peek());
    }
}
