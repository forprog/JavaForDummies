public class UseTemperatureNice {

	public static void main(String[] args) {
		
		TemperatureEvenNicer temp = new TemperatureEvenNicer();
		temp.setNumber(70.0);
		temp.setScale(TempScale.FAHRENHEIT);
		temp.display();
		
		temp.convetTo(TempScale.CELSIUS);
		temp.display();
		
		temp.convetTo(TempScale.FAHRENHEIT);
		temp.display();

		temp = new TemperatureEvenNicer(TempScale.CELSIUS);
		temp.display();

		temp.convetTo(TempScale.FAHRENHEIT);
		temp.display();
	}

}
