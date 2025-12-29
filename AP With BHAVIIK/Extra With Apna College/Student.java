// Logic & Program & Sortcut..
import java.util.Scanner; // Input 1-> Program On Continue,,, But  Just 0-> Input Stopped Program..
public class Student {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int Choise; // While in Used So, Here Decelar...

         do {

            System.out.println("Enter 1 To Input Marks OR 0 To Stop.");
            Choise = sc.nextInt(); // New Logic... Not Define Data Type.. Shortcut Name ...But ----

            if ( Choise == 1) 
             {
                System.out.println("Enter Student Mark's In Subject MATHS(1-100): ");
                int Marks = sc.nextInt();

                if ( Marks >= 90 ) 
                 { 
                    System.out.println("This is Good");
                 }

                else if ( Marks >= 60 ) 
                 { 
                    System.out.println("This is Also Good"); 
                 }

                else if ( Marks >= 0 ) 
                 { 
                    System.out.println("This is Good as Well");
                 }

                 else 
                 { 
                    System.out.println("Invalid marks. Please enter a value between 0 and 100."); 
                 }

             }

                else if ( Choise != 0) 
                {
                    System.out.println("Please,  Enter Valid Input & Only Enter 0 OR 1");  
                }

        } while( Choise != 0);

        System.out.println("Program  Stopped");
    }
}