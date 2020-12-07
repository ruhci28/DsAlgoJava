import java.util.*;

public class LevelOrderTraversel{
    static class node{
        int data;
        node left,right;
        public node(int x){
            data=x;
            left=right=null;
        }
    }

    static void LevelOrder(node root){
        if(root==null){
            System.out.println("Empty BST");
            return;
        }
        Queue<node> q=new LinkedList<>();
        node temp=root;
//        System.out.print(temp.data+" ");
        q.add(root);
        while(!q.isEmpty()){
            node n=q.poll();
            System.out.print(n.data+" ");
            if(n.left!=null)q.add(n.left);
            if(n.right!=null)q.add(n.right);
        }

    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right = new node(6);

        LevelOrder(root);

    }
}