package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {

    static void printLevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        Node temp = root;
        while(temp != null){
            System.out.print("      "+temp.key+"  ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            if(q.isEmpty()) {
                temp = null;
                break;
            }
           temp = q.peek();
           q.remove();
        }
    }

    public static void main(String[] args){
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(54);
        tree.root.right.right.right = new Node(22);
        printLevelOrder(tree.root);
    }

}
