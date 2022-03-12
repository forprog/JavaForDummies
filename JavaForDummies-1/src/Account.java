import static java.lang.System.out;

public class Account {
	String name;
	String adress;
	double balance;
	
	public void display() {
		out.print(name);
		out.print(" (");
		out.print(adress);
		out.print(") account amount is $");
		out.print(balance);
		out.println();
	}
}
