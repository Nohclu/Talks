public class BankAccount implements BankInterface {
    public double balance = 0.0;

    @Override
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    @Override
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }
}