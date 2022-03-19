import java.util.Random;

import com.allmycode.dummiesframe.DummiesFrame;

public class UseAccountFrame {
	public static void main(String args[]) {
		DummiesFrame frame = new DummiesFrame("Account view");
		frame.addRow("Full name");
		frame.addRow("Address");
		frame.addRow("Balance");
		frame.setButtonText("View");
		frame.go();
	}
	public static String calculate(String name, String address, double balance) {
		Account myAccount = new Account();
		myAccount.setName(name);
		myAccount.setAdress(address);
		myAccount.setBalance(balance);
		return myAccount.getName() + " (" + myAccount.getAdress() + ") have $" + myAccount.getBalance() + " on account";
	}
}
