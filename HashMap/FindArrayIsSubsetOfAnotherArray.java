package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class FindArrayIsSubsetOfAnotherArray {
    static void checkIfSubset(int[] a1, int[] a2){
        HashSet<Integer> array1Element = new HashSet<Integer>();
        for(int i = 0; i < a1.length; i++){
            array1Element.add(a1[i]);
        }
        for(int j =0; j < a2.length; j++){
            if(!array1Element.contains(a2[j])){
                System.out.println("Array 2 is not the subset of Array 1");
                return;
            }
        }
        System.out.println("Array 1 is subset of array2");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1 array ");
        int size1 = sc.nextInt();
        int[] a1 = new int[size1];
        System.out.println("Enter the element of array 1 ");
        for(int i = 0; i < size1; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter length of second array ");
        int size2 = sc.nextInt();
        int[] a2 = new int[size2];
        System.out.println("Enter the element of the array 2");
        for(int j =0; j < size2; j++){
            a2[j] = sc.nextInt();
        }
        checkIfSubset(a1,a2);
    }
}
