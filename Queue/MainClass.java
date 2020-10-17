package Queue;

public class MainClass {
    public static void main(String[] args){
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueue(2);
        mq.enqueue(47);
        mq.enqueue(46);
        mq.enqueue(42);
        mq.enqueue(44);
        mq.enqueue(41);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());


    }


}
