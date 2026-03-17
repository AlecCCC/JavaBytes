public class Main {
    public static void main(String[] args) {

        System.out.println(numberPalindrome(414));

    }

    public static boolean numberPalindrome(int number) {

        if (number < 0 ) {return false;}

        int original = number;
        int reversed = 0;

        while (number > 0) {

            int digit = number % 10;  //grab last digit 313 % 10 = 3
            reversed = reversed * 10 + digit;  //reversed  = 0 * 10 + 3 = 3
            number /= 10; // new number = 313/ 10 = 13

            System.out.printf("Digit: %d Current Reversed: %d  Current Number: %d  \n", digit, reversed, number);
        }

        System.out.printf("\n%d = %d?\n", original, reversed);

        return original == reversed;

    }
}