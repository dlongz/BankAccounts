public class BankAccount {
    private double checking_balance;
    private double savings_balance;
    private static int totalAccountsSoFar;
    private static double totalBalanceEver;

    public BankAccount(){
        this.checking_balance = 0;
        this.savings_balance = 0;
        totalAccountsSoFar++;
        
    }

    public void getCheckingBalance(){
        System.out.printf("Your Checking Account Balance is: $%,.2f%n",checking_balance);
    }

    public void getSavingBalance(){
        System.out.printf("Your Savings Account Balance is: $%,.2f%n",savings_balance);
    }

    public static void getTotalBalanceEvery(){
        System.out.printf("Total Bank Balance Ever: $%,.2f%n",totalBalanceEver);
    }

    public static void getTotalAccountsSoFar(){
        System.out.printf("Total Bank Accounts: %d%n",totalAccountsSoFar);
    }

    public void depositeMoneyChecking(double money){
        this.checking_balance += money;
        BankAccount.totalBalanceEver += money;
        
        System.out.printf("$%,.2f has been deposited to your checking account.\nNew Checking Account Balance is: $%,.2f\n",money, checking_balance);
    }
    public void depositeMoneySaving(double money){
        this.savings_balance += money;
        BankAccount.totalBalanceEver += money;
        System.out.printf("$%,.2f has been deposited to your saving account.\nNew Savings Account Balance is: $%,.2f\n",money, savings_balance);
    }

    public void withdrawChecking(double money){
        if (checking_balance <=0){
            System.out.println("Insufficient Funds. Please deposite Money then try again. We value you as a customer.\n");
        } else {
            this.checking_balance -= money;
            BankAccount.totalBalanceEver += money;
            System.out.printf("$%,.2f has been successfullly withdrawed.\nNew Checking Account Balance is: $%,.2f\n",money,checking_balance);
        }
    }
    
    public void withdrawSavings(double money){
        if (savings_balance <=0){
            System.out.println("Insufficient Funds. Please deposite Money then try again. We value you as a customer.\n");
        } else {
            this.savings_balance -= money;
            BankAccount.totalBalanceEver += money;
            System.out.printf("$%,.2f has been successfullly withdrawed.\nNew Savings Account Balance is: $%.2f\n",money,savings_balance);
        }
    }

    public void getTotalAccountsBalance(){
        double totalAccountsBalance = checking_balance + savings_balance;
        System.out.printf("Your Total Accounts Balance is: $%.2f%n",totalAccountsBalance);
    }














}
