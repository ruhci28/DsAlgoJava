package BinarySearchTree;

import BinaryTree.Node;

public class BST {
    static Node root;
    BST(){
        root = null;
    }
    static void insert(int key){
        root = insertNode(root,key);
    }
    static Node insertNode(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertNode(root.left,key);
        }
        else{
            root.right = insertNode(root.right,key);
        }
        return root;
    }

    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.key+ " ");
        inOrder(root.right);
    }
    static Node search(Node root,int key){
        if(root == null || root.key == key){
            return root;
        }
        if(key < root.key){
           return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    static int minValue(Node root){
        if(root.left != null){
           return minValue(root.left);
        }
        return root.key;
    }
    public static void main(String[] args){
        BST tree = new BST();
        insert(6);
        insert(3);
        insert(8);
        insert(1);
        insert(4);
        inOrder(tree.root);
        Node searchedRoot = search(tree.root,4);
        System.out.println();
        System.out.println(searchedRoot.key);
        System.out.println(minValue(tree.root));

    }
}
