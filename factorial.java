public class factorial {
    public static void main(String[] args) {
        int number = 10;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }
}
