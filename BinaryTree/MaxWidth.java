package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaxWidth {
    static int MaximumWidth(Node root){
        if(root == null){
            return 0;
        }
        int max = 1;
        Queue<Node> q = new LinkedList<>();
        Node temp = root;
        while(temp != null){
//            System.out.print("      "+temp.key+"  ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            if(q.size() > max){
                max = q.size();
            }
            if(q.isEmpty()) {
                temp = null;
                break;
            }
            temp = q.peek();
            q.remove();
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTreeIntro tree = new BinaryTreeIntro();

//               1
//         2            3
//    4        8     12     54
// 21    23   24 25   26 27    22
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(54);
        tree.root.right.right.right = new Node(22);
        tree.root.left.left.left = new Node(21);
        tree.root.left.left.right = new Node(23);
        tree.root.left.right.left = new Node(24);
        tree.root.left.right.right = new Node(25);
        tree.root.right.left.left = new Node(26);
        tree.root.right.left.right = new Node(27);
        System.out.println("Maximum Width of the tree is : "+MaximumWidth(tree.root));
    }
}
