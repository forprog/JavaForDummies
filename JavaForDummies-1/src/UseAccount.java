import static java.lang.System.out;

public class UseAccount {
	public static void main(String args[]) {
		Account myAccount;
		Account yourAccount;

		myAccount = new Account();
		yourAccount = new Account();
		
		myAccount.name = "Barry Berd";
		myAccount.adress = "222 Cyberspace lane";
		myAccount.balance = 24.02;
		
		yourAccount.name = "Jane Smith";
		yourAccount.adress = "111 Consumer Street";
		yourAccount.balance = 55.63;
		
		out.print(myAccount.name);
		out.print(" (");
		out.print(myAccount.adress);
		out.print(") account amount is $");
		out.print(myAccount.balance);
		
		out.println();
		
		out.print(yourAccount.name);
		out.print(" (");
		out.print(yourAccount.adress);
		out.print(") account amount is $");
		out.print(yourAccount.balance);

	}
}
