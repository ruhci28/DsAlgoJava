package Stack;

public class EvaluationOfPostfixExp {
    static boolean isOperator(char c){
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }
    static int evaluatePostfix(String exp) throws Exception {
        MyStack<Integer> postfixStack = new MyStack<Integer>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == ' ')continue;

           if(isOperator(ch)){
               int operand1 = postfixStack.pop();
               int operand2 = postfixStack.pop();
               switch (ch) {
                   case '+':
                       postfixStack.push(operand1+operand2);
                       break;
                   case '-':
                       postfixStack.push(operand2-operand1);
                       break;
                   case '*':
                       postfixStack.push(operand1*operand2);
                       break;
                   case '/':
                       postfixStack.push(operand2/operand1);
                       break;
               }
           }else{
               int n = 0;
               while(Character.isDigit(ch))
               {
                   n = n*10 + (int)(ch-'0');
                   i++;
                   ch = exp.charAt(i);
               }
               i--;
               postfixStack.push(n);
           }
        }
        return postfixStack.peek();
    }
    public static void main(String[] args) throws Exception {
        String postfixExp = "100 200 + 2 / 5 * 7 +";
        int result = evaluatePostfix(postfixExp);
        System.out.println(result);
    }
}
//    Time complexity of evaluation algorithm is O(n) where n is number of characters in input expression.
//    There are following limitations of above implementation.
//    1) It supports only 4 binary operators ‘+’, ‘*’, ‘-‘ and ‘/’.
//       It can be extended for more operators by adding more switch cases.
