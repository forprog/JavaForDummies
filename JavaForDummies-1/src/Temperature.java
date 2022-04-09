
public class Temperature {
	private double number;
	private TempScale scale;
	
	public Temperature() {
		setNumber(0.0);
		setScale(TempScale.FAHRENHEIT);
	}

	public Temperature(double number) {
		setNumber(number);
		setScale(TempScale.FAHRENHEIT);
	}
	
	public Temperature(TempScale scale) {
		setNumber(0.0);
		setScale(scale);
	}

	public Temperature(double number, TempScale scale) {
		setNumber(number);
		setScale(scale);
	}
	
	
	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public TempScale getScale() {
		return scale;
	}

	public void setScale(TempScale scale) {
		this.scale = scale;
	}
	
	
	
}
