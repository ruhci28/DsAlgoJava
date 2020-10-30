package Queue;

public class DequeUsingCircularArray {
    static class Deque{
        int arr[];
        int front = -1 ;
        int rear = 0;
        int size = 0;
        public Deque(int size) {
            arr = new int[size];
            this.size = size;
        }
        void insertFront(int a) {
            if(front == -1) {
                front = 0;
                rear = 0;
                arr[0] = a;
            }
            else if(isFull()){
                System.out.println("queue is full");
                return;
            }else {
                front = (front+1)%size;
                arr[front] = a;
            }
        }
        void insertRear(int a) {
             if(isFull()){
                System.out.println("queue is full");
            } else {
                rear = (rear + (size - 1)) % size;
                arr[rear] = a;
            }
        }
        void deleteFront(){
         if(isEmpty()) return;
         front = (front + (size - 1)%size);
        }
        void deleteRear(){
            if(isEmpty()) return;
            rear = ( rear + 1 )%size;
        }
        boolean isEmpty(){
            return (front == -1 && rear == -1);
        }
        boolean isFull(){
            return ((front == 0 && rear == size-1)||
                    front == rear+1);
        }
        int getFront(){
            return arr[front];
        }
        int getRear(){
            return arr[rear];
        }
    }
    public static void main(String[] args) {
        Deque dq = new Deque(5);
        System.out.println("Insert element at rear end  : 5 ");
        dq.insertRear(5);

        System.out.println("insert element at rear end : 10 ");
        dq.insertRear(10);

        System.out.println("get rear element : "+ dq.getRear());

        dq.deleteRear();
        System.out.println("dkajkf");
        System.out.println("After delete rear element new rear become : " +
                dq.getRear());

        System.out.println("inserting element at front end");
        dq.insertFront(15);

        System.out.println("get front element: " +dq.getFront());

        dq.deleteFront();

        System.out.println("After delete front element new front become : " +
                +  dq.getFront());
        System.out.println("inserting element at front end");
        dq.insertFront(25);

        System.out.println("get front element: " +dq.getFront());

    }
}

