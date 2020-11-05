package BinaryTree;

public class HeightOfTree {
    public static void main(String[] args) {
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.left.right = new Node(7);
        System.out.println(tree.height(tree.root));
    }
}
