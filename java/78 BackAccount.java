package code;
class BankAccount{
	private double balance;
	private String accNum,accHolderName;
	public BankAccount(double balance, String accNum, String accHolderName) {
		this.balance = balance;
		this.accNum = accNum;
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount");
		}
		else {
			this.balance+=amount;
			System.out.println("Balance updated");
		}
	}
	public void withdraw(double amount) {
		if(amount>this.balance || amount<=0) {
			System.out.println("Invalid amount");
		}
		else {
			this.balance-=amount;
			System.out.println("Withdrawal successful");
		}
	}
}
	
public class Test {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000.0, "SB-123456", "Alice Smith");

        myAccount.deposit(500.0);

        myAccount.deposit(-100.0);

        myAccount.withdraw(200.0);

        myAccount.withdraw(1500.0);

        myAccount.withdraw(0);
	}
}