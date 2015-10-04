public class Money {
	double balance;

	public Money() {
		balance = 1000;
	}

	double getBalance() {
		return balance;
	}

	double getMoney(double amount) {
		if (balance - amount <= 0)
			return 0;
		else {
			balance = balance - amount;
			return balance;
		}
	}

	double giveMoney(double amount) {
		balance = balance + amount;
		return balance;
	}
}
