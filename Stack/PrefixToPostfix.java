package Stack;

//Examples:
//
//        Input :  Prefix :  *+AB-CD
//        Output : Postfix : AB+CD-*
//        Explanation : Prefix to Infix :  (A+B) * (C-D)
//        Infix to Postfix :  AB+CD-*
//
//        Input :  Prefix :  *-A/BC-/AKL
//        Output : Postfix : ABC/-AK/L-*
//        Explanation : Prefix to Infix :  A-(B/C)*(A/K)-L
//        Infix to Postfix : ABC/-AK/L-*


//  Algorithm for Prefix to Postfix:
//
//  Read the Prefix expression in reverse order (from right to left)
//  If the symbol is an operand, then push it onto the Stack
//  If the symbol is an operator, then pop two operands from the Stack
//  Create a string by concatenating the two operands and the operator after them.
//  string = operand1 + operand2 + operator
//  And push the resultant string back to Stack
//  Repeat the above steps until end of Prefix expression.

public class PrefixToPostfix {
    static boolean isOperator(char ch) {
        boolean test ;
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }
    static String preToPost(String preExp) throws Exception {
        int size = preExp.length();
        MyStack<String> postfixExp = new MyStack<String>();
        for(int i = size-1; i >= 0; i--) {
            if(isOperator(preExp.charAt(i))){
                String s1 = postfixExp.pop();
                String s2 = postfixExp.pop();
                String finalString = s1+s2+preExp.charAt(i);
                postfixExp.push(finalString);
            }else{
                postfixExp.push(String.valueOf(preExp.charAt(i)));
            }
        }
        return postfixExp.peek();
    }
    public static void main(String[] args) throws Exception {
        String pre_exp = "*+AB-CD";
        System.out.println("Prefix : "+ pre_exp);
        System.out.println("Postfix : " + preToPost(pre_exp));
        String pre_exp2 = "*-A/BC-/AKL";
        System.out.println("Prefix : "+ pre_exp2);
        System.out.println("Postfix : " + preToPost(pre_exp2));
    }
}
