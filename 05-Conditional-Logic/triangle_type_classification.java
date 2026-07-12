/*
 * Question: Classify a valid triangle as Equilateral, Isosceles, or Scalene.
 * Approach: First check if the triangle is possible. If yes, check for equilateral (all sides equal), 
 * then isosceles (at least two sides equal), otherwise it defaults to scalene.
 */
import java.util.*;

class triangle_type_classification 
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Enter 3 sides...");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if (a + b > c && b + c > a && a + c > b) 
        {
            if (a == b && b == c) 
            {
                System.out.println("Equilateral Triangle");
            } 
            else if (a == b || b == c || c == a) 
            {
                System.out.println("Isosceles Triangle");
            } 
            else 
            {
                System.out.println("Scalene Triangle");
            }
        } 
        else 
        {
            System.out.println("Triangle not possible.");
        }
    }
}
