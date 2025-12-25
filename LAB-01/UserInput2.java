import java.util.Scanner;
public class UserInput2 {
        public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Int value:- "); 
        int x = sc.nextInt();
        System.out.println("int = " + x);

        System.out.println("Enter Float Value:- ");
        float y = sc.nextFloat();
        System.out.println("Float = "+ y);

        System.out.println("Enter Double Value:- ");
        double z = sc.nextDouble();
        System.out.println("Doule = "+ z);

        System.out.println("Enter A Charater:- ");
        String c = sc.next();
        System.out.println("charater = "+ c);

        System.out.println("Enter T/F:- ");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean = "+ b);

    }
}