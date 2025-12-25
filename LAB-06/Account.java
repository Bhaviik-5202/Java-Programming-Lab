import java.util.Scanner;
class Bank_Account 
{

    int accountNo;
    String username;
    String email;
    String accounttype;
    int accountBalance;
 
    public Bank_Account (int accountNo, String username, String email, String accounttype, int accountBalance) 
    {
        this.accountNo = accountNo;
        this.username = username;
        this.email = email;
        this.accounttype = accounttype;
        this.accountBalance = accountBalance;
    }
    public void displayAccountDetails() 
    {
        System.out.println("Account No. " + accountNo + " is having " + accountBalance + " Rs. in Account.");
    }
    public String getAccountDetails() 
    {
        return("Account No. " + accountNo + " is having " + accountBalance + " Rs. in Account.");
    }

}

public class Account 
 {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        Bank_Account Ba1 = new Bank_Account(101, "BHAVIIK", "er.bhavik5202@gmail.com", "SA", 100000);

        Bank_Account Ba2 = new Bank_Account(102, "Darshan Uni.", "Darshan@uni.com", "CA", 100);

        Ba1.displayAccountDetails();

        String Ans = Ba2.getAccountDetails();
        System.out.println(Ans);

    }
 }
