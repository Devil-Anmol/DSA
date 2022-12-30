//Author: AG

class Node{
    private int key;
    private Node next = null;

    public Node(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public int getKey() {
        return key;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class Stack {
    Node root;

    public Stack(int root) {
        this.root = new Node(root);
    }

    public void push(int key){
        Node n = new Node(key);
        n.setNext(root);
        this.root = n;
    }

    public int pop(){
        if(this.isEmpty()==false){
            Node n = this.root;
            this.root = this.root.getNext();
            return n.getKey();
        }
        return 0;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public void printStack(){
        if(this.isEmpty()){
            System.out.println("null");
        }
        else{
            Node n = this.root;
            while(n!=null){
                System.out.println(n.getKey());
                n = n.getNext();
            }
        }
    }

    public static void main(String[] args) {
        // Static Stack creation
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(1);
        stack.push(11);
        stack.push(105);
        stack.push(18);
        stack.printStack();
        System.out.println(stack.pop());

    }
}
