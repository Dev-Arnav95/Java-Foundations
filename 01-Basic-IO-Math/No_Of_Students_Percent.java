/*
 * Question: Accept total number of students and number of girls. Calculate percentages.
 * Approach: Calculate total boys by subtracting girls from total students. 
 * Compute the respective percentages by dividing by total students and multiplying by 100.
 */
import java.util.*;

public class No_Of_Students_Percent
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        double bp, gp;
        int students, girls, boys;
        System.out.println("Total no. of Students...");
        students = in.nextInt();
        girls = in.nextInt();
        
        boys = students - girls;
        bp = (boys / (double)students) * 100; // Typecast to ensure correct decimal division
        gp = (girls / (double)students) * 100;
        
        System.out.println("Percentage of boys =" + bp);
        System.out.println("Percentage of girls =" + gp);
    }
}
