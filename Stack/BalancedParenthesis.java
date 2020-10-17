package Stack;

import java.util.Scanner;

public class BalancedParenthesis {
    static boolean isOpeningBracket(char ch){
        switch (ch){
            case '{':
            case '[':
            case '(':
                return true;
        }
        return false;
    }
    static boolean isBalanced(String str) throws Exception {
        MyStack<Character> balancedStack = new MyStack<Character>();
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isOpeningBracket(ch)){
                balancedStack.push(ch);
            }else{
                char topElement;
                switch (ch){
                    case '}':{
                        if(balancedStack.isEmpty())
                        return false;
                       topElement = balancedStack.peek();
                       if(topElement == '{'){
                           balancedStack.pop();
                       }else {
                           balancedStack.push(ch);
                       }
                       break;
                    }
                    case ']':{
                        if(balancedStack.isEmpty())
                            return false;
                        topElement = balancedStack.peek();
                        if(topElement == '['){
                            balancedStack.pop();
                        }else {
                            balancedStack.push(ch);
                        }
                        break;
                    }
                    case ')': {
                        if(balancedStack.isEmpty())
                            return false;
                        topElement = balancedStack.peek();
                        if (topElement == '(') {
                            balancedStack.pop();
                        } else {
                            balancedStack.push(ch);
                        }
                        break;
                    }
                }
            }

        }
        return balancedStack.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthesis Expression : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }

}
