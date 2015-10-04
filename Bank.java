import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int anotherTransaction = 1;
		int choice;
		double amount;
		String name;
		Money money = new Money();
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the ATM. How may I help you?");
		System.out
				.println("1.Withdrawal \n 2.Deposit \n 3.Check Balance \n 4. End Transaction");

		choice = scan.nextInt();
		while (anotherTransaction == 1) {
			switch (choice) {

			case 1:
				System.out.println("How much would you like to withdraw?");
				amount = scan.nextInt();
				if (money.getMoney(amount) == 0)
					System.out.println("ERROR: INSUFFICIENT FUNDS");
				else {
					System.out.println("After this transaction, you now have $"
							+ money.getBalance());
					System.out
							.println("Would you like to make another transaction?");
					name = scan.next();
					if (name.equalsIgnoreCase("no"))
						anotherTransaction = 0;
					else {
						System.out.println("What would you like to do?");
						choice = scan.nextInt();
					}
				}

				break;

			case 2:
				System.out.println("How much would you like to deposit?");
				amount = scan.nextInt();
				System.out.println("After this transaction, you now have $"
						+ money.giveMoney(amount));
				System.out
						.println("Would you like to make another transaction?");
				name = scan.next();
				if (name.equalsIgnoreCase("no"))
					anotherTransaction = 0;
				else {
					System.out.println("What would you like to do?");
					choice = scan.nextInt();
				}
				break;

			case 3:
				System.out.println("Your current balance is $"
						+ money.getBalance());
				System.out
						.println("Would you like to make another transaction?");
				name = scan.next();
				if (name.equalsIgnoreCase("no"))
					anotherTransaction = 0;
				else {
					System.out.println("What would you like to do?");
					choice = scan.nextInt();
				}
				break;

			default:
				anotherTransaction = 0;
				break;

			}

		}
		System.out.println("Thanks for using this ATM");
	}
}
