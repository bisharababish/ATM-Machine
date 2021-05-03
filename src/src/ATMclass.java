package src;

import java.util.Scanner;

public class ATMclass {
	private int YourBalance;

	public ATMclass() {
		System.out.println("\nATM Is Ready To Aceept The Card!");
		YourBalance = 50000;
		EnterPin();
		SelectTransaction();
	}

	public void SelectTransaction() {
		System.out.println("\nEnter 'd' to Deposit And 'w' to Withdraw");
		System.out.println("Enter 'Exit' to Exit the Program");
		@SuppressWarnings("resource")
		String s = new Scanner(System.in).nextLine();
		switch (s) {
		case "d":
			Deposit();
			break;
		case "w":
			WithDraw();
		case "Exit":
			Exit();
		}
	}

	public void Exit() {
		System.out.println("Good Bye!");
		System.exit(0);
	}

	public void Deposit() {
		System.out.println("\nHow Much Cash You Want To Deposit ? ");
		@SuppressWarnings("resource")
		int i = new Scanner(System.in).nextInt();
		YourBalance = YourBalance + i;
		System.out.println("Cash has been Deposited , Your Total Balance : " + YourBalance);
		ExitOrReSelectTransaction();
	}

	public void ExitOrReSelectTransaction() {
		System.out.println("\nType e to exit or any other key to reselect transaction ");
		@SuppressWarnings("resource")
		String s = new Scanner(System.in).nextLine();
		if (s == "e") {
			return;
		} else {
			SelectTransaction();
		}
	}

	public void WithDraw() {
		System.out.println("How Much Cash You Wanna Withdraw ? ");
		@SuppressWarnings("resource")
		int i = new Scanner(System.in).nextInt();
		if (YourBalance < i) { // if the required amount is less than the balance
			System.out.println("Sorry you don't enough amount in your account !");
		} else {
			// + CASH DISPENSED!! + DISPLAY BALANCE!!
			YourBalance = YourBalance - i;
			System.out.println("\nYour Balance is: " + YourBalance);
			System.out.println("\nThe cash has been dispensed , Collect it !!");
		}
		ExitOrReSelectTransaction();
	}

	public void EnterPin() {
		System.out.println("\nEnter Your Pin:");
		@SuppressWarnings("resource")
		int pin = new Scanner(System.in).nextInt();
		System.out.println("Your Pin Is: " + pin);
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.Insert("Bishara");
		list.Insert("George");
		System.out.println("Enter Your Name: ");
		@SuppressWarnings("resource")
		String name = new Scanner(System.in).nextLine();
		for (int i = 0; i <= list.getSize(); i++) {
			if (list.getName(i).equals(name)) {
				System.out.println("\nYour account is Found!");
				new ATMclass();
			}
		}
	}
}
