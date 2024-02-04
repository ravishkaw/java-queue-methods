public class CircularQueue {

    public int[] myArray = new int[6];
    public int front= -1;
    public int  rear = -1;
    public int n = myArray.length;

    public void enqueue(int val){
        if (front == -1 && rear == -1){
            front = rear = 0;
            myArray[rear] = val;
        } else if((rear + 1) % n == front){
            System.out.println("Overflow");
        } else {
            rear = (rear + 1) %n;
            myArray[rear] = val;
        }
    }

    public void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Underflow");
        } else {
            int temp = myArray[front];
            front = (front + 1)%n;
            System.out.println(temp + " dequeued!");
        }
    }

    public void print(){
        if (front == -1 && rear == -1){
            System.out.println("Underflow");
        } else {
            int i = front;
            while(i != rear) {
                System.out.print(myArray[i] + " ");
                i = (i + 1)%n;
            }
            System.out.print(myArray[rear]);
        }
    }

    public static void main(String[] args){
        CircularQueue myQueue = new CircularQueue();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.enqueue(60);

        myQueue.print();

        System.out.println(" ");

        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.print();

        System.out.println(" ");

        myQueue.enqueue(70);
        myQueue.enqueue(80);

        System.out.println(" ");

        myQueue.print();

        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.print();

        System.out.println(" ");

        myQueue.enqueue(90);
        myQueue.enqueue(100);

        myQueue.print();

    }

}
