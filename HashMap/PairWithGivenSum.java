package HashMap;


import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSum {
    static void pairWithSum(int[] a,int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        int remaining;
        for(int i = 0; i < a.length; i++){
            remaining = sum - a[i];
            if(set.contains(a[i])){
               System.out.println("Yes it contains the pair with sum = "+ sum+" with element first is "+(sum-a[i])+" with element second is "+ a[i]);
               return;
            }else {
                set.add(sum-a[i]);
            }
        }
        System.out.println("No pair exits with sum = "+sum);
    }
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements");
        for(int i =0; i < size;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the sum : ");
        int sum = sc.nextInt();
        pairWithSum(a,sum);
    }
}
