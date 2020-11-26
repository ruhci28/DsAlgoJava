package BinaryTree;

public class DiameterOfBT {
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
    static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = Diameter(root.left);
        int rightDiameter = Diameter(root.right);

        return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter,rightDiameter));
    }
    public static void main(String[] args) {
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(6);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.left.right = new Node(8);
        System.out.println(Diameter(tree.root));

    }
}
//                      1
//            3                           4
//         6     5
//       7
//          8
