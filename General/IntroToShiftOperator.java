package General;
//Shift Operators are used to shift the number left or right thereby multiplying or dividing the number by 2 respectively.
//General Format : number shift_op number_of_places_to_shift;
public class IntroToShiftOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = -10;

        System.out.println(a+"<<2 = "+ (a<<2));
        System.out.println(b+">>1 = "+ (b>>1));
        System.out.println(b+">>>2 = "+ (b>>>2));

    }
}
//   Note: Unsigned Left shift operator (<<<) –
//   Unlike unsigned Right Shift, there is no “<<<" operator in Java,
//   because the logical (<<) and arithmetic left-shift (<<<) operations are identical.
