package BinaryTree;

public class PrintAncestorOfAKey {
    static boolean printAncestor(Node root,int target){
        if(root == null){
            return false;
        }
        if(root.key == target){
            return true;
        }
        if(printAncestor(root.left,target)||printAncestor(root.right,target)){
            System.out.println(root.key+" ");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(54);
        tree.root.right.right.right = new Node(22);
        printAncestor(tree.root, tree.root.right.right.right.key);
    }
//                      1
//            2                    3
//      4          8         12         54
//                                            22
}
