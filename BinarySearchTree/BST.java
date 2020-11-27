package BinarySearchTree;

import BinaryTree.Node;

import java.util.Random;

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
    static void delete(Node key){

    }
    static int maxValue(Node root){
        if(root.right != null){
            return maxValue(root.right);
        }
        return root.key;
    }
    static int getSuccessor(Node root, int data){
        Node current = search(root,data);
        if(current == null){
            return -1;
        }
        if(current.right != null){
            return minValue(current.right);
        }
        else {
            Node successor = null;
            Node ancestor = root;
            while(ancestor != current){
                if(ancestor.key>current.key){
                    successor = ancestor;
                    ancestor = ancestor.left;
                }else {
                    ancestor = ancestor.right;
                }
            }
            return (successor != null) ? successor.key : -1;
        }
    }
    static int getPredecessor(Node root, int data){
        Node current = search(root,data);
        if(current == null){
            return -1;
        }
        if(current.left != null){
            return maxValue(current.left);
        }
        else{
            Node predecessor = null;
            Node ancestor = root;
            while (ancestor != current){
                if(ancestor.key < current.key){
                    predecessor = ancestor;
                    ancestor = ancestor.right;
                } else{
                    ancestor = ancestor.left;
                }
            }
            return (predecessor != null) ? predecessor.key : -1;
        }

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
        System.out.println("InOrder Successor of 4 is "+getSuccessor(tree.root,4));
        System.out.println("Inorder Predecessor of 4 is "+getPredecessor(tree.root,4));

    }
}
