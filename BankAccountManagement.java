public class BankAccountManagement {
    public static class BankAccount {
        public String accountNumber;
        protected String accountHolder;
        private double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    public static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + getBalance());
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Manan", 5000.0);
        System.out.println("Original Balance: " + account.getBalance());
        account.setBalance(6000.0);
        System.out.println("Updated Balance: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Naman", 8000.0);
        savingsAccount.displayAccountDetails();
    }
}

// Sample Output
//Original Balance: 5000.0
//Updated Balance: 6000.0
//Account Number: 987654321, Account Holder: Naman, Balance: 8000.0