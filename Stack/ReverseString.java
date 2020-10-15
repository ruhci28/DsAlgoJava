package Stack;

import java.util.Scanner;

public class ReverseString {
    static String reverseString(String str) throws Exception {
        MyStack<Character> reverseString = new MyStack<Character>();
        int size = str.length();
        for(int i =0; i < size; i++){
            reverseString.push(str.charAt(i));
        }
        String reverse = "";
        for (int i =0 ; i < size; i++){
            reverse = reverse + reverseString.pop();

        }
      return reverse;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the String : ");
        str = sc.nextLine();
        System.out.println("Reversed String : "+reverseString(str));
    }
}
