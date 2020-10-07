package GOCC;

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
            int count = 0;
            int k = 1;
            while((x*k < largestNumber) && (y*k < largestNumber)) {
                if((x*k) == (y*k))
                    count++;
                k++;
            }
            System.out.println("Divisibility count is : "+ count);
        }
    }
}
