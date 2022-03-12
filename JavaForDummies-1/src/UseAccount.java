import static java.lang.System.out;

public class UseAccount {
	public static void main(String args[]) {
		Account myAccount = new Account();
		Account yourAccount = new Account();

		myAccount.name = "Barry Berd";
		myAccount.adress = "222 Cyberspace lane";
		myAccount.balance = 24.02;
		
		yourAccount.name = "Jane Smith";
		yourAccount.adress = "111 Consumer Street";
		yourAccount.balance = 55.63;
		
		myAccount.print();
		
		yourAccount.print();
	}
}
