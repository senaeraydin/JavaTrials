import bank.BankAccount;
import bank.DepositAccount;

public class Main {
    public static void main(String[] args) {

        double initialBalance, depositAmount, withdrawAmount;
        initialBalance = 2560;
        depositAmount = 600;
        withdrawAmount = 235;

        DepositAccount depositAccount = new DepositAccount(123, initialBalance);

        System.out.println("Deposit " +depositAmount + "\n");
        depositAccount.deposit(depositAmount);

        System.out.println("\n");

        System.out.println("Withdraw "+withdrawAmount +"\n");
        depositAccount.withdraw(withdrawAmount);
    }
}