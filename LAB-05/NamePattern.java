import java.util.Scanner;
public class NamePattern

 {
    public static void main( String [] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Name: ");
        String Name = sc.nextLine();
        
        char [] charArray = Name.toCharArray();
        
        for (int i = 1; i <= charArray.length; i++) 
         {
            for (int j = 0; j < i; j++) 
             {
                System.out.print(charArray[j]);
             }

            System.out.println("");
         }
        
     }
 }
 