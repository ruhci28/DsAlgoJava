package BinarySearchTree;

import BinaryTree.BinaryTreeIntro;
import BinaryTree.Node;

import java.util.Arrays;

public class BTtoBST {
    static int[] temp;
    static int index = 0;
    static int count = 0;
    static Node convertBTtoBST(Node root,int size){
        temp = new int [size];
        fillArray(root);
        Arrays.sort(temp);
        changeValue(root);
        return root;
    }
    static void changeValue(Node root){
        if(root == null){
            return;
        }
        changeValue(root.left);
        root.key = temp[count];
        count++;
        changeValue(root.right);
    }
    static void fillArray(Node root){
        if(root == null){
            return;
        }
        fillArray(root.left);
        temp[index++] = root.key;
        fillArray(root.right);
    }
    public static void main(String[] args){
        BinaryTreeIntro tree = new BinaryTreeIntro();
        tree.root = new Node(5);
        tree.root.left = new Node(7);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(12);
        tree.root.left.right = new Node(34);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(4);
        System.out.println("InOrder Traversal of Tree before Converting : ");
        tree.inOrder(tree.root);
        System.out.println();
        convertBTtoBST(tree.root,7);
        System.out.println("InOrder Traversal of Tree after Conversion: ");
        tree.inOrder(tree.root);

    }
}
