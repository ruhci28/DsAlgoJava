package BinaryTree;

public class InOrderWithoutStackWithoutRecursion {
    public static void main(String[] args){
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        System.out.println("In order traversal : ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Morris Traversal : ");
        tree.MorrisTraversal(tree.root);
        ;
    }
}
//         1
//      2      3
//   4     8
//            1
//                 3