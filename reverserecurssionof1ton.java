public class reverserecurssionof1ton {
    public static void main(String[] args) {
        int n =10;

        System.out.println("Numbers from " + n + " to 1:");
        printNumbers(n, 1);
    }

    private static void printNumbers(int current, int n) {
        if (current < n) {
            return; 
        }
        System.out.print(current + " ");
        printNumbers(current - 1, n); 
    }
}
