import static java.lang.System.out;

public class UseAccount {
	public static void main(String args[]) {
		Account myAccount = new Account();
		Account yourAccount = new Account();

		myAccount.setName("Barry Berd");
		myAccount.setAdress("222 Cyberspace lane");
		myAccount.setBalance(24.02);
		
		yourAccount.setName("Jane Smith");
		yourAccount.setAdress("111 Consumer Street");
		yourAccount.setBalance(55.63);

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
