/*
 * Question: Accept 3 sides and check if a triangle can be formed.
 * Approach: A triangle is possible only if the sum of any two sides is greater 
 * than the third side. Use the logical AND (&&) operator to verify all combinations.
 */
import java.util.*;

public class triangle_possiblity_validator
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Enter 3 lengths...");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if (a + b > c && a + c > b && b + c > a) 
        {
            System.out.println("A triangle is possible.");
        } 
        else 
        {
            System.out.println("Triangle is not possible.");
        }
    }
}
