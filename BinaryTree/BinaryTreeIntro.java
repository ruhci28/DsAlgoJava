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
    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.key+ " ");
        inOrder(root.right);
    }
    static void PreOrder(Node root){
        if(root == null) return;
        System.out.print(root.key+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void PostOrder(Node root){
        if(root == null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.key+" ");
    }
    public static void main(String[] args) {
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        inOrder(tree.root);
        System.out.println();
        PreOrder(tree.root);
        System.out.println();
        PostOrder(tree.root);

    }
}
