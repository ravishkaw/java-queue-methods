public class Queue {

    public int[] myArray = new int[6];
    public int front = 0;
    public int rear = -1;
    public int n = myArray.length;

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        myQueue.print();

        System.out.println(" ");

        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.print();
    }

    public void enqueue(int data) {
        if (rear == n - 1) {
            System.out.println("Overflow");
        } else {
            ++rear;
            myArray[rear] = data;
        }
    }

    public void dequeue() {
        if (rear == -1) {
            System.out.println("Underflow");
        } else {
            int temp = myArray[front];
            ++front;
            System.out.println(temp + " dequeued!");
        }
    }

    public void print() {
        if (rear == -1) {
            System.out.println("Underflow");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}
