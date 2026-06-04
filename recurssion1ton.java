public class recurssion1ton {
    public static void main(String[] args) {
        int n =10;

        System.out.println("Numbers from 1 to " + n + ":");
        printNumbers(1, n);
    }

    private static void printNumbers(int current, int n) {
        if (current > n) {
            return; 
        }
        System.out.print(current + " ");
        printNumbers(current + 1, n); 
    }
}
