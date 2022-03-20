import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

public class DoPayrollTypeP {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner	diskScanner = new Scanner(new File("EmpInfoNew.txt"));
		Scanner kbdScanner = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			payOneFTEmployee(diskScanner);
		}
		
		for (int i = 4; i <= 6; i++) {
			payOnePTEmployee(diskScanner,kbdScanner);			
		}
		kbdScanner.close();
	}

	private static void payOnePTEmployee(Scanner diskScanner, Scanner kbdScanner) {
		PartTimeEmployee employee = new PartTimeEmployee();
		
		employee.setName(diskScanner.nextLine());
		employee.setJobTitle(diskScanner.nextLine());
		employee.setHourlyRate(diskScanner.nextDouble());
		diskScanner.nextLine();
		diskScanner.nextLine();
		
		out.print("Enter ");
		out.print(employee.getName());
		out.print("'s hours worked this week: ");
		int hours = kbdScanner.nextInt();
		
		employee.cutCheck(employee.findPaymentAmount(hours));
		out.println();
	}

	private static void payOneFTEmployee(Scanner diskScanner) {
		FullTimeEmployee employee = new FullTimeEmployee();
		
		employee.setName(diskScanner.nextLine());
		employee.setJobTitle(diskScanner.nextLine());
		employee.setWeeklySalary(diskScanner.nextDouble());
		employee.setBenefitDeduction(diskScanner.nextDouble());
		diskScanner.nextLine();
		diskScanner.nextLine();
		
		employee.cutCheck(employee.findPaymentAmount());
		out.println();
	}

}
