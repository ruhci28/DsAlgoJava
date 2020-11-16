package BinaryTree;

import java.util.Scanner;

public class TreeFromInOrderPreOrderTraversal {
    static Node buildTree(int[] inOrder, int[] preOrder, int preIndex,int startIndex, int endIndex ){
        if(startIndex > endIndex)
            return null;
        if(preIndex >= preOrder.length){
            return null;
        }
        System.out.println("startIndex "+startIndex);
        System.out.println("End Index "+endIndex);
        System.out.println("preOrder "+preOrder[preIndex]);
        Node toAdd = new Node(preOrder[preIndex]);
        int inIndex = -1;
        for(int i = 0; i < inOrder.length; i++){
            if(inOrder[i] == preOrder[preIndex]) {
                System.out.println("found in inOder "+inOrder[i]+ " i = " +i);
                inIndex = i;
                break;
            }
        }
        preIndex++;
        toAdd.left = buildTree(inOrder, preOrder, preIndex, startIndex, inIndex-1);
        toAdd.right = buildTree(inOrder, preOrder, preIndex, inIndex+1, endIndex);
        return toAdd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeIntro tree = new BinaryTreeIntro();
        System.out.println("Enter the size of the tree : ");
        int size = sc.nextInt();
        int[] preOrder = new int[size];
        int[] inOrder = new int[size];
        System.out.println("Enter the preOrder Traversal : ");
        for(int i = 0; i < size; i++){
            preOrder[i] = sc.nextInt();
        }
        System.out.println("Enter the InOder Traversal : ");
        for(int i = 0; i < size; i++){
            inOrder[i] = sc.nextInt();
        }
        System.out.println("build tree called");
        Node root = buildTree(inOrder, preOrder, 0,0,size-1);
        System.out.println("PostOder Traversal of the Created Tree : ");
        tree.inOrder(root);


    }
}
