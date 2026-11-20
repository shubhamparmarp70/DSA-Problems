package BitwiseOperators;

public class BitwiseRightShift {
    public static void main(String[] args){

        // Signed Right Shift Operator (>>)

        int num = 33;
        System.out.println("Bitwise right shift of " + num + " by 1 is: " + (num >> 1));

        int num1 = 16;
        System.out.println("Bitwise right shift of " + num1 + " by 2 is: " + (num1 >> 2));

        int y = 4;
        System.out.println("Bitwise right shift of " + num1 + " by " + y + " is: " + (num1 >> y));

        // Unsigned Right Shift Operator (>>>)

        int num2 = -33;
        System.out.println("Bitwise unsigned right shift of " + num2 + " by 1 is: " + (num2 >>> 1));

        int num3 = -16;
        System.out.println("Bitwise unsigned right shift of " + num3 + " by 2 is: " + (num3 >>> 2));

        int num4 = 32;
        System.out.println("Bitwise unsigned right shift of " + num4 + " by 3 is: " + (num4 >>> 3));
    }
}
