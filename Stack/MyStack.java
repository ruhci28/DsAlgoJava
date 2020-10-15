package Stack;

import LinkedList.MyLinkedList;

public class MyStack<E> {
    private MyLinkedList<E> ll = new MyLinkedList<E>();
    void push(E data) {
     ll.add(data);
    }
    public E pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
      E deleted = ll.delete();
      return deleted;
    }
    public E peek() {
       E peeked = ll.lastElement();
       return  peeked;
    }
    void print(){
        ll.print();
    }
}
