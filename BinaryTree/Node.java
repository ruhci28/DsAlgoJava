package BinaryTree;

public class Node{
    public int key;
    public Node left, right;
    public Node(int key){
        this.key = key;
        right = left = null;
    }
    public Node(){
        this.key = 0;
        right = left = null;
    }
}