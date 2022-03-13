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
		
		myAccount.display();
		yourAccount.display();
		
		double myInterest = myAccount.getInterset(5); 
		double yourInterest = yourAccount.getInterset(7);
		
		out.printf("$%4.2f\n",myInterest);
		out.printf("$%6.2f\n",myInterest);
		out.printf("$%3.2f\n",myInterest);
		out.printf("$%.2f\n",myInterest);
		out.printf("$%.2f $%.2f",myInterest,yourInterest);
	}
}
