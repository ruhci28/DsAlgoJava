package BinaryTree;

public class BTSubTreeOfAnotherBT {
    static boolean isIdentical(Node T1, Node T2){
        if(T1 == null && T2 == null){
            return true;
        }
        if(T1 == null || T2 == null){
            return false;
        }
        return (T1.key == T2.key && isIdentical(T1.left, T2.left) && isIdentical(T1.right,T2.right));
    }
    static boolean isSubtree(Node T1, Node T2){
        if(T1 == null){
            return true;
        }
        if(T2 == null){
            return false;
        }
        if(isIdentical(T1,T2)){
            return true;
        }
        return (isSubtree(T1, T2.left) && isSubtree(T1, T2.right));
    }
    public static void main(String[] args) {
        BinaryTreeIntro tree1 = new BinaryTreeIntro();
        tree1.root = new Node(1);
        tree1.root.right = new Node(3);
        tree1.root.left = new Node(2);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.root.right.left = new Node(6);
        tree1.root.right.right = new Node(7);
        tree1.root.left.left.left = new Node(8);
        tree1.root.left.left.right = new Node(9);
        tree1.root.left.left.left.left = new Node(10);
        BinaryTreeIntro tree2 = new BinaryTreeIntro();
        tree2.root = new Node(3);
        tree2.root.left = new Node(6);
        tree2.root.right = new Node(7);
        if(isSubtree(tree2.root,tree2.root)){
            System.out.println("Tree 2 is a subtree of Tree 1");
        } else {
            System.out.println("Tree 2 is not a subtree of Tree 1");
        }
    }
}
//                                          1
//                                2                   3
//                           4         5           6      7
//                      8        9
//                  10
//
// Tree 1
//         3
//     6       7