public class sumofdigits {
    public static void main(String[] args) {
        int n = 99;
        int sum = calculateSumOfDigits(n);
        System.out.println("The sum of the digits in " + n + " is: " + sum);
    }

    private static int calculateSumOfDigits(int number) {
        if (number == 0) {
            return 0; 
        }
        return (number % 10) + calculateSumOfDigits(number / 10); 
    }
}
