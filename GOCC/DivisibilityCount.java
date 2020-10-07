package GOCC;
import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class DivisibilityCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int NoOfTestCases = sc.nextInt();
        for(int i =0; i < NoOfTestCases; i++) {
            System.out.println("Enter the digit : ");
            int N = sc.nextInt();
            System.out.println("Enter first no : ");
            int x = sc.nextInt();
            System.out.println("Enter second no : ");
            int y = sc.nextInt();
            int largestNumber = 0;
            for(int j = 0; j < N; j++) {
                largestNumber = largestNumber*10 +9;
            }
            int k = 1;
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set2 = new HashSet<Integer>();
            while(x*k < largestNumber) {
                set1.add(x*k);
                k++;
            }
            k = 1;
            while(y*k < largestNumber){
                set2.add(y*k);
                k++;
            }
            Set<Integer> intersection = new HashSet<Integer>(set1);
            intersection.retainAll(set2);
            System.out.println("Divisibility count is : "+ intersection.size());
        }
    }
}
