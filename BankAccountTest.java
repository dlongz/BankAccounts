public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount David = new BankAccount();
        BankAccount Shane = new BankAccount();
        BankAccount Kristian = new BankAccount();
        BankAccount Kyra = new BankAccount();

        David.getCheckingBalance();
        David.getSavingBalance();
        
        David.depositeMoneyChecking(10000.00);
        David.depositeMoneySaving(500000.00);
        
        David.withdrawChecking(500.00);
        David.withdrawChecking(700.00);
        David.withdrawChecking(250.00);

        David.getTotalAccountsBalance();

        Shane.depositeMoneyChecking(100000.99);
        Shane.depositeMoneySaving(700000000.00);

        Shane.withdrawSavings(50000000.00);

        BankAccount.getTotalBalanceEvery();
        BankAccount.getTotalAccountsSoFar();


    }
}
