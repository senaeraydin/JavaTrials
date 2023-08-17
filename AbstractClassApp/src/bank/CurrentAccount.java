package bank;

public class CurrentAccount extends BankAccount{


    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Your money is deposited. Current money is: " + getBalance());

    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Your money is withdrawed. Current money is: " + getBalance());

    }
}
