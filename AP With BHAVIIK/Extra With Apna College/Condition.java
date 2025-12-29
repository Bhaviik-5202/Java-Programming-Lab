import java.util.Scanner;
public class Condition {
    public static void main ( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if ( age > 18) 
        {
        System.out.println("This is Adult");    
        }
        else 
        {
            System.out.println("This is Not ADult");
        }
    }
}
