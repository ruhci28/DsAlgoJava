package BinarySearchTree;

//package practice;

//import java.util.Scanner;
//
//
//public class MergeTwoBalancedBST {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String str="?3?1??1????2";
//        StringBuilder s=new StringBuilder(str);
//        char one='1';
//        char two='2';
//        char three='3';
//
//        for(int i=0;i<s.length();i++){
//
//
//            if(s.charAt(i)=='?'){
//
//                if(i==0){
//                    if(s.length()==1){
//                        s.setCharAt(i,one);
//                    }else{
//                        if(s.charAt(i+1)=='1'){
//                            s.setCharAt(i,two);
//                        }
//
//                        else  if(s.charAt(i+1)=='2'){
//                            s.setCharAt(i,one);
//                        }
//
//                        else  if(s.charAt(i+1)=='3'){
//                            s.setCharAt(i,one);
//                        }
//
//                        else  if(s.charAt(i+1)=='?'){
//                            s.setCharAt(i,one);
//                        }
//
//                    }
//
//                    continue;
//                }//first cahracter
//
//                if(i==s.length()-1){
//
//                    if(s.charAt(i-1)=='1'){
//                        s.setCharAt(i,two);
//                    }
//
//                    else if(s.charAt(i-1)=='2'){
//                        s.setCharAt(i,one);
//                    }
//
//                    else if(s.charAt(i-1)=='3'){
//                        s.setCharAt(i,one);
//                    }
//
//
//                    continue;
//                }//last character
//
//                else{
//
//                    if((s.charAt(i-1)=='1' && s.charAt(i+1)=='1')){
//                        s.setCharAt(i,two);
//                    }
//
//                    else if((s.charAt(i-1)=='2' && s.charAt(i+1)=='2') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='3')){
//                        s.setCharAt(i,one);
//                    }
//
//                    else if((s.charAt(i-1)=='1' && s.charAt(i+1)=='?')){
//                        s.setCharAt(i,two);
//                    }
//
//                    else if((s.charAt(i-1)=='2' && s.charAt(i+1)=='?') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='?')){
//                        s.setCharAt(i,one);
//                    }
//
//                    else if((s.charAt(i-1)=='1' && s.charAt(i+1)=='2') || (s.charAt(i-1)=='2' && s.charAt(i+1)=='1')){
//                        s.setCharAt(i,three);
//                    }
//
//
//                    else if((s.charAt(i-1)=='1' && s.charAt(i+1)=='3') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='1')){
//                        s.setCharAt(i,two);
//                    }
//
//                    else if((s.charAt(i-1)=='2' && s.charAt(i+1)=='3') || (s.charAt(i-1)=='3' && s.charAt(i+1)=='2')){
//                        s.setCharAt(i,one);
//                    }
//
//                }//In between
//
//
//            }//if ?
//
//
//        }//for
//
//        System.out.println("string is: "+s);
//    }
//
//}

// import BinaryTree.Node;
//
//public class MergeTwoBalancedBST {
//    static int size1,size2;
//    static int[] temp1 = new int[size1];
//    static int[] temp2 = new int[size2];
//    static int[] temp3 = new int[size1+size2];
//    static int index1,index2,index3;
//    static Node merge(Node root1, Node root2, int size1, int size2){
//
//    }
//    static void fillArray(Node root, int[] temp){
//        if(root == null){
//            return;
//        }
////        fillArray(root.left);
//    }
//
//    public static void main(String[] args){
//        BST tree1 = new BST();
//        BST tree2 = new BST();
//        merge(tree1.root,tree2.root,1,2);
//    }
//}
