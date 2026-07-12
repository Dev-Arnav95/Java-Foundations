/*
 * Question: Calculate the final amount after 3 years using a fixed 5% interest rate.
 * Approach: Calculate the interest year by year, adding the generated interest 
 * back to the principal before calculating the next year's interest.
 */
import java.util.*;

class Compound_Interest_Calc
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double p, i, a;
        
        System.out.println("Enter the principal...");
        p = in.nextDouble();
        
        i = (p * 5) / 100;
        System.out.println("Interest for 1st year=" + i);
        p = p + i;
        
        i = (p * 5) / 100;
        System.out.println("Interest for 2nd year=" + i);
        p = p + i;
        
        i = (p * 5) / 100;
        a = p + i;
        System.out.println("Amount at the end of 3rd year=" + a);
    }
}
