import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {

        ownerName = name;
        accountType = accountCategory;

        accountNumber = Bank.totalAccounts;
        Bank.totalAccounts++;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public String getAccountOwnerName()
    {
        return ownerName;
    }

    public void changeAccountBalance(double change)
    {
        accountBalance += change;
    }

    public void setAccountOwnerName(String newOwner)
    {
        ownerName = newOwner;
    }
}