package BinaryTree;
class Node{
    int key;
    Node left, right;
    public Node(int key){
        this.key = key;
        right = left = null;
    }
}
public class BinaryTreeIntro {
    Node root;
    BinaryTreeIntro(int key) {
        root = new Node(key);
    }
    BinaryTreeIntro() {
        root = null;
    }
    public static void main(String[] args) {
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
    }
}
