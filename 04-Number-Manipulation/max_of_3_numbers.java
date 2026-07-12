/*
 * Question: Find the largest among 3 numbers.
 * Approach: Compare the first two numbers to identify the larger one, then 
 * compare that result with the third number to determine the greatest.
 */
import java.util.*;

class max_of_3_numbers
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3, max;
        
        System.out.println("Enter 3 numbers...");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        
        if (n1 > n2) 
        {
            max = n1;
        } 
        else 
        {
            max = n2;
        }
        
        if (max > n3) 
        {
            System.out.println("Greatest number = " + max);
        } 
        else 
        {
            System.out.println("Greatest number = " + n3);
        }
    }
}
