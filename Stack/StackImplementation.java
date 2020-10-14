package Stack;

public class StackImplementation {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(4);
        stack.push(199);
        int poppedElement = stack.pop();
        stack.print();

    }
}
