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
    static void MorrisTraversal(Node root){
        if(root == null){
            return;
        }
        Node curr = root;
        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.key+ " ");
                curr = curr.right;
            }else{
                Node temp = curr.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                Node temp1 = curr;

                curr = curr.left;
                temp1.left = null;
                temp.right = temp1;

            }
        }
    }
    static int height(Node curr){
        int hie = 1;
        if(curr == null){
            return 0;
        }
        if(curr.left == null && curr.right == null){
            return hie;
        }else{
            int leftHeight = height(curr.left);
            int rightHeight = height(curr.right);
            hie = Math.max(leftHeight,rightHeight);
        }
        return hie+1;
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
        System.out.println();
        System.out.println("height");
        System.out.println(height(tree.root));

    }
}
