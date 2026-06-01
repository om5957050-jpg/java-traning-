import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your first number");
        int num1=sc.nextInt();
        System.out.println("enter your second number");
        int num2=sc.nextInt();
         System.out.println("Enter an operator(+,-,*,/):");
         char operator =sc.next().charAt(0);
         if (operator=='+') {
            System.out.println("result:");
            System.out.println(num1+num2);
         }
         else if (operator=='-') {
            System.out.println("result:");
            System.out.println(num1-num2);
         }
         else if (operator=='*') {
            System.out.println("result:");
            System.out.println(num1*num2);
         }
         else if (operator=='/') {
            System.out.println("result:");
            System.out.println(num1/num2);
         }
         else{
            System.out.println("invalid operator");
         }
    }
}
