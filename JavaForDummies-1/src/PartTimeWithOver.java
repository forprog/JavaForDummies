
public class PartTimeWithOver extends PartTimeEmployee {

	@Override
	public double findPaymentAmount(int hours) {
		if (hours <= 40) {
			return getHourlyRate() * hours;
		} else {
			return getHourlyRate() * hours + getHourlyRate()*2*(hours-40); 
		}
	}
}
