import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DoPayrollBufferedReader {

	public static void main(String[] args) throws IOException {
		try (BufferedReader diskReader = new BufferedReader(new FileReader("EmployeeInfo.txt"))){
			for (int empNum = 1; empNum <= 3; empNum++) {
				payOneEmployee(diskReader);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void payOneEmployee(BufferedReader diskReader) {
		Employee anEmployee = new Employee();
		
		try {
			anEmployee.setName(diskReader.readLine());
			anEmployee.setJobTitle(diskReader.readLine());
			anEmployee.cutCheck(Double.parseDouble(diskReader.readLine()));
		} catch (NumberFormatException n) {
			System.out.println("[Employee has no 'amountPaid' value]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}