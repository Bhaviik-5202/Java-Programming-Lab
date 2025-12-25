import java.util.Scanner; //Left Patten....
public class Left {

    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Left Patten: ");
        

        for (int i = 0; i <=5; i++) 
        {
            for (int j = 0; j <=i;  j++) 
            {
                System.out.print("* ");
            }
            
            System.out.println("  ");
        }
    }
}