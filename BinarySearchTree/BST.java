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
    static Node minValue(Node root){
        if(root.left != null){
           return minValue(root.left);
        }
        return root;
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
            return minValue(current.right).key;
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
    static Node findAncestor(Node root, Node ancestorOf){
        Node temp = root;
        while((temp.left.key != ancestorOf.key)&&(temp.right.key != ancestorOf.key)){
            if(ancestorOf.key < temp.key){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return temp;
    }
    static void delete(Node root, Node toDelete){
//        Node curr = search(root,toDelete.key);
        if(toDelete.left == null && toDelete.right == null){
            Node ancestor = findAncestor(root,toDelete);
            if(toDelete.key < ancestor.key){
                ancestor.left = null;
            }else{
                ancestor.right = null;
            }
        }else if(toDelete.left == null || toDelete.right == null){
            Node ancestor = findAncestor(root,toDelete);
            if(toDelete.key<ancestor.key){
                if(toDelete.left != null){
                    ancestor.left = toDelete.left;
                }else{
                    ancestor.left = toDelete.right;
                }
            }else
            {
                if(toDelete.left != null){
                    ancestor.right = toDelete.left;
                }else{
                    ancestor.right = toDelete.right;
                }
            }
        }else{
            Node min = minValue(toDelete.right);
            toDelete.key = min.key;
            delete(toDelete,minValue(toDelete.right));
        }
    }
    static boolean isBST(Node root) {
        if (root == null) {
            return true;
        }
        boolean isBSTree = false;
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean isLeftIsBST = false;
        boolean isRightIsBST = false;
        if(root.left == null ){
            isLeftIsBST = true;
        }else{
            if(root.left.key < root.key){
                isLeftIsBST = isBST(root.left);
            }
            else return false;
        }
        if(root.right == null){
            isRightIsBST = true;
        }else{
            if(root.right.key > root.key){
                isRightIsBST = isBST(root.right);
            }else{
                return false;
            }

        }
        if(isLeftIsBST && isRightIsBST){
            isBSTree = true;
        }
       return isBSTree;

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
        System.out.println(minValue(tree.root).key);
        System.out.println("InOrder Successor of 4 is "+getSuccessor(tree.root,4));
        System.out.println("Inorder Predecessor of 4 is "+getPredecessor(tree.root,4));
         delete(tree.root,tree.root.left);
        inOrder(tree.root);
        System.out.println("is BST "+isBST(tree.root) );
    }
}

//          6
//      3       8
//    1    4