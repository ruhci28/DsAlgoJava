package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class node {
    int data;
    node left, right, nextRight;
    node (int data){
        this.data = data;
        left = right = nextRight = null;
    }
}

public class ConnectNodeAtSameLevel {
    node root;
    void connect (){
        Queue<node> q = new LinkedList<>();
        q.add(root);
        node temp = null;
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i = 0; i < n; i++){
                node prev = temp;
                temp = q.poll();
                if(i > 0){
                    prev.nextRight = temp;
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }

            }
            temp.nextRight = null;
        }

    }
    public static void main(String[] args){
        ConnectNodeAtSameLevel tree = new ConnectNodeAtSameLevel();
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.root.right.left = new node(6);
        tree.connect();
        System.out.println("Following are populated nextRight pointers in the tree(-1 is printed if there is no nextRight)");
        int a = tree.root.nextRight != null ? tree.root.nextRight.data : -1;
        System.out.println("nextRight of " + tree.root.data + " is "+ a);
        int b = tree.root.left.nextRight != null ? tree.root.left.nextRight.data : -1;
        System.out.println("nextRight of " + tree.root.left.data + " is "
                + b);
        int c = tree.root.right.nextRight != null ? tree.root.right.nextRight.data : -1;
        System.out.println("nextRight of " + tree.root.right.data + " is "
                + c);
        int d = tree.root.left.left.nextRight != null ? tree.root.left.left.nextRight.data : -1;
        System.out.println("nextRight of " + tree.root.left.left.data + " is "
                + d);
    }
}
