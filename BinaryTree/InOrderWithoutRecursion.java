package BinaryTree;

import java.util.Stack;

public class InOrderWithoutRecursion {
    static void printInOrder(Node root){
        Stack<Node> s = new Stack<>();
//        s.push(root);
        Node curr = root;
        while((!s.isEmpty()) || (curr != null)){
            while (curr != null){
                s.push(curr);
                curr = curr.left;
            }
            Node poped = s.pop();
            System.out.println(poped.key);
            curr = poped.right;
        }
    }
    public static void main(String[] args){
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        printInOrder(tree.root);

    }
}
