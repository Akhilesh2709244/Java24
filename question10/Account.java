package question10;

public interface Account {
	void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}
