import static java.lang.System.out;

public class Account {
	private String name;
	private String adress;
	private double balance;
	
	public void setName(String n) {
		if (!n.equals("")) {
			name = n;
		}
	}
	
	public String getName() {
		return name;
	}
	

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void display() {
		out.print(name);
		out.print(" (");
		out.print(getAdress());
		out.print(") account amount is $");
		out.print(getBalance());
		out.println();
	}
	
	public double getInterset(double percentageRate) {
		return getBalance()*percentageRate / 100.00;
	}
}
