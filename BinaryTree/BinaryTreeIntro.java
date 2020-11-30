package BinaryTree;

public class BinaryTreeIntro {
    public Node root;
    BinaryTreeIntro(int key) {
        root = new Node(key);
    }
    public BinaryTreeIntro() {
        root = null;
    }
    public static void inOrder(Node root){
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

//    static boolean isBST(Node root) {
//        if (root == null) {
//            return true;
//        }
//        boolean isBSTree = false;
//        if (root.left == null && root.right == null) {
//            return true;
//        }
//        boolean isLeftIsBST = false;
//        boolean isRightIsBST = false;
//        if(root.left == null ){
//            isLeftIsBST = true;
//        }else{
//            if(root.left.key < root.key){
//                isLeftIsBST = isBST(root.left);
//            }
//            else return false;
//        }
//        if(root.right == null){
//            isRightIsBST = true;
//        }else{
//            if(root.right.key > root.key){
//                isRightIsBST = isBST(root.right);
//            }else{
//                return false;
//            }
//
//        }
//        if(isLeftIsBST && isRightIsBST){
//            isBSTree = true;
//        }
//        return isBSTree;
//
//    }

//    EFFICIENT APPROACH FOR IsBST
    static boolean isBST(Node root){
        return isBSTUtil(root,-2147483648,2147483647);
    }
    static boolean isBSTUtil(Node root, int minRange, int maxRange){
        if(root == null){
            return true;
        }
        if(root.key < maxRange && root.key > minRange && isBSTUtil(root.left,minRange,root.key) && isBSTUtil(root.right,root.key,maxRange))
            return true;
        else return false;
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
        System.out.println(isBST(tree.root));

    }
}
