/*
 * Question: Find the minimum value among 3 input numbers.
 * Approach: Use the built-in Math.min() function to first compare two numbers, 
 * then compare that result with the third number to find the absolute minimum.
 */
import java.util.*;

class min_number_of_3
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3, min;
        
        System.out.println("Enter 3 numbers...");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        
        min = Math.min(n1, n2);
        min = Math.min(min, n3);
        
        System.out.println("Minimum number =" + min);
    }
}
