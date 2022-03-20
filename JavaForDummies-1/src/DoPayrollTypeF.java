
public class DoPayrollTypeF {

	public static void main(String[] args) {
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		
		ftEmployee.setName("Barry Berd");
		ftEmployee.setJobTitle("CEO");
		ftEmployee.setWeeklySalary(5000);
		ftEmployee.setBenefitDeduction(500);
		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
		System.out.println();
		
		PartTimeEmployee ptEmployee = new PartTimeEmployee();
		ptEmployee.setName("Steve Gordon");
		ptEmployee.setJobTitle("Driver");
		ptEmployee.setHourlyRate(45.18);
		ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10));
	}

}
