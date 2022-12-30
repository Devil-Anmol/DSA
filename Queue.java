// Author: AG

class Nodeq{
    private int key;
    private Nodeq next = null;

    public Nodeq(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public Nodeq getNext() {
        return next;
    }

    public void setNext(Nodeq next) {
        this.next = next;
    }
}

public class Queue {
    Nodeq root=null;
    Nodeq head=null;

    public Queue(int root) {
        this.root = new Nodeq(root);
        this.head = this.root;
    }

    public void push(int key){
        Nodeq n = new Nodeq(key);
        n.setNext(this.head);
        this.head = n;
    }
    public boolean isEmpty(){
        return this.root==null;
    }
    public int pop(){
        if(this.isEmpty()==false){
            Nodeq n = this.root;
            Nodeq m = this.head;
            if(this.head==this.root){
                this.head = null;
                this.root = this.head;
                return n.getKey();
            }
            while(m.getNext()!=this.root){
                m = m.getNext();
            }
            this.root = m;
            this.root.setNext(null);
            return n.getKey();
        }
        return 0;
    }
    public void printQueue(){
        if(this.isEmpty()!=false){
            System.out.println("null");
        }
        Nodeq n = this.head;
        while(n!=null){
            System.out.println(n.getKey());
            n = n.getNext();
        }
    }

    public static void main(String[] args) {
        // Static Queue creation
        Queue q = new Queue(5);
        q.push(10);
        q.push(1);
        q.push(11);
        q.push(105);
        q.push(18);
        q.printQueue();
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

        q.printQueue();


    }
}
