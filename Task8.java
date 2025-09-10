public class Task8 {

    public static void main(String[] args) {
        int number = 12345;

        System.out.println("Calculating the sum of digits for " + number + " with a loop...");

        // --- START OF BLOCK TO REPLACE ---
        int sum = sumDigitsRecursive(number);
        // --- END OF BLOCK TO REPLACE ---

        System.out.println("The sum of the digits is: " + sum);
    }

    // TODO: Create a public static int sumDigitsRecursive(int number) function here.
    public static int sumDigitsRecursive(int number) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        return lastDigit + sumDigitsRecursive(number / 10);
    }
}