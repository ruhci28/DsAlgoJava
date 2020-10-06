package General;

public class IntroToBitwiseOperator {
    public static void main(String[] args) {
        int a = 28;
        int b = 19;

        System.out.println(a+" & "+b+" = "+(a&b));
        System.out.println(a+" | "+b+" = "+(a|b));
        System.out.println(a+" ^ "+b+" = "+(a^b));
        System.out.println("~"+a+" = "+(~a));
        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a &= b"+" after this a becomes");
        System.out.println("a= " + a);

    }
}
