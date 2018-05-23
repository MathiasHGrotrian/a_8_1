package Chapter8;
// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount
{
    double transactionFee = 0.00;
    String name;
    double balance;

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount, double setTransactionFee)
    {
        if (balance >= (amount+transactionFee) && amount >= 0.0 && transactionFee >= 0.0)
        {
            transactionFee = setTransactionFee;
            balance = (balance - amount) - transactionFee;
            System.out.println("successful withdraw");
        }
        else
        {
            System.out.println("Your withdraw met a mistake, try again");
        }
    }
}