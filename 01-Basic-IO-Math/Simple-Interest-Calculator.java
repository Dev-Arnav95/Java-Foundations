/*
 * Question: Calculate Simple Interest based on user inputs.
 * Approach: Take Principal, Rate, and Time values as double data types to account 
 * for decimal values, then apply the formula (P * R * T) / 100.
 */
import java.util.*;

class Simple_Interest 
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double si, p, r, t;
        System.out.println("Enter Principal, Rate, Time...");
        p = in.nextDouble();
        r = in.nextDouble();
        t = in.nextDouble();
        si = (p * r * t) / 100;
        System.out.println("Simple Interest=" + si);
    }
}
