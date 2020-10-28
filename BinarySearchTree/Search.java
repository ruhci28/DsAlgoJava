package BinarySearchTree;
import java.util.Stack;

class Node{
    int key;
    static Node left, right;
    public Node(int key){
        this.key = key;
        right = left = null;
    }
}
public class Search {
    static Node root;
    Search(int key) {
        root = new Node(key);
    }
    Search() {
        root = null;
    }
    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.key+ " ");
        inOrder(root.right);
    }
    static void inOrderWithoutRecursion(){
        if(root == null){
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        while(curr != null || s.size() > 0){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.key);
            curr = curr.right;
        }
    }
        public static Node insert(Node root, int key){
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if((root.left == null && root.key > key)|| (root.right == null && root.key < key)){
            Node toAdd = new Node(key);
            if(root.key < key){
                root.right = toAdd;
            }else{
                root.left = toAdd;
            }
            return toAdd;
        }
        if(key < root.key){
         return insert(root.left, key);
        }
        return insert(root.right,key);
    }
    public static Node searchKey(Node root,int key){
        if(root == null || root.key == key)
            return root;
        if(root.key > key){
            return searchKey(root.left, key);
        }
            return searchKey(root.right, key);
    }
    public static void deletion(Node root, int key){

    }
    public static Node minimum(Node root){
       if(root.left == null){
           return root;
       }
       return minimum(root.left);
    }
    public static  void main(String[] args) {
        Search tree = new Search();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        Node res = searchKey(tree.root, 8);
        System.out.println(res.key);
        inOrder(tree.root);
    }
}
//    Time Complexity: The worst-case time complexity of search and insert operations is O(h) where h is the height of the Binary Search Tree. In the worst case, we may have to travel from root to the deepest leaf node. The height of a skewed tree may become n and the time complexity of search and insert operation may become O(n).
//        https://youtu.be/qYo8BVxtoH4
//        Some Interesting Facts:
//
//        Inorder traversal of BST always produces sorted output.
//        We can construct a BST with only Preorder or Postorder or Level Order traversal. Note that we can always get inorder traversal by sorting the only given traversal.
//        Number of unique BSTs with n distinct keys is Catalan Number