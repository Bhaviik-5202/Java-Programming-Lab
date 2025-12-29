import java.util.Scanner;

public class Condition2 
{
    public static void main ( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        if ( a == b) 
        {
            System.out.println("A & B Are Equal");
        }
        else if ( a > b ) 
        {
            System.out.println("A Is Grater Then.");    
        }
        else 
        {
            System.out.println("B Is Grater Then.");
        }
    }

}
