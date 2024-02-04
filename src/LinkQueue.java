class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkQueue {
    public static Node head;
    public static Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(int val){
        Node newRear = new Node(val);

        if (isEmpty()){
            head = newRear;
            tail = newRear;
        } else {
            tail.next = newRear;
            tail = newRear;
        }
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Underflow");
        } else {
            Node temp = head;
            head = head.next;
            System.out.println(temp.data + " dequeued!");
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Underflow");
        } else {
            Node temp = head;
            while( temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args){
        LinkQueue myLinkQueue = new LinkQueue();

        myLinkQueue.enqueue(10);
        myLinkQueue.enqueue(12);
        myLinkQueue.enqueue(36);
        myLinkQueue.enqueue(16);
        myLinkQueue.enqueue(26);

        myLinkQueue.print();

        System.out.println(" ");

        myLinkQueue.dequeue();
        myLinkQueue.dequeue();

        myLinkQueue.print();

    }
}
