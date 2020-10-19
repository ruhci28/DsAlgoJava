package Queue;

class ArrayImplementation {
    int front,rear,size,capacity;
    int arr[];
    public ArrayImplementation(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }
    boolean isFull(){
        return size == capacity;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void enqueue(int data){
        if(isFull())
            return;
        rear =  ( rear + 1 ) % capacity;
        arr[rear] = data;
        size++;
    }
    int dequeue(){
        if(isEmpty())
            return -1;
        int item = arr[front];
        front = (front+1)%capacity;
        size--;
        return item;
    }
    int front(){
        if(isEmpty()){
            return  -1;
        }
        return arr[front];
    }
    int rear(){
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
}
public class ArrayImplementationTest{
    public static void main(String[] args) {
        ArrayImplementation q = new ArrayImplementation(10);
        q.enqueue(1);
        q.enqueue(10);
        q.enqueue(13);
        q.enqueue(43);
        q.enqueue(33);
        System.out.println("Dequeue : "+ q.dequeue());
        System.out.println("Dequeue : "+ q.dequeue());
        System.out.println("front: "+ q.front());
        System.out.println("rear : "+ q.rear());
    }

}