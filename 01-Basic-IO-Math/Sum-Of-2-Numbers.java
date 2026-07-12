/*
 * Question: Input 2 numbers and calculate their sum.
 * Approach: Import the Scanner class to read two integer variables, 
 * add them together, and store the result in a third variable to print.
 */
import java.util.Scanner;

class Sum 
{
    public static void main() 
    {
        Scanner in = new Scanner(System. someIn); // Fixed initialization for input
        int a, b, c;
        System.out.println("Enter 2 numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = a + b;
        System.out.println("Sum = " + c);
    }
}
