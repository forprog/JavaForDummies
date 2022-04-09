public class TemperatureEvenNicer extends TemperatureNice {

	public TemperatureEvenNicer() {
		super();
	}

	public TemperatureEvenNicer(double number) {
		super(number);
	}

	public TemperatureEvenNicer(TempScale scale) {
		super(scale);
	}

	public TemperatureEvenNicer(double number, TempScale scale) {
		super(number, scale);
	}

	public void convetTo(TempScale newTempScale) {
		if (getScale() == TempScale.CELSIUS && newTempScale == TempScale.FAHRENHEIT) {
			setScale(newTempScale);
			setNumber(getNumber()*9/5+32);
		} else if (getScale() == TempScale.FAHRENHEIT && newTempScale == TempScale.CELSIUS) {
			setScale(newTempScale);
			setNumber((getNumber()-32)*5/9);
		} 
	}

}
