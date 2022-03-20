import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartTimeEmployeeTest {
	PartTimeEmployee emp;
	
	@BeforeEach
	void setUp() throws Exception {
		emp = new PartTimeEmployee();
	}

	@Test
	void testFindPaymentAmount() {
		emp.setHourlyRate(20);
		double expected = 800;
		double actual = emp.findPaymentAmount(40);
		double marginOfError = 0.01;
		assertEquals(expected,actual,marginOfError);
	}

}
