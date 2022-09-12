package Chapter11;

public class UseStudent {

	public static void main(String[] args) {
		double[] arGrades = new double[6];
		
		arGrades[0] = 1;
		arGrades[1] = 2;
		arGrades[2] = 1;
		arGrades[3] = 4;
		arGrades[4] = 4;
		arGrades[5] = 1;
		
		Student Billy = new Student("Billy", 1, 0.0, Majors.MATHEMATICS, arGrades);
		
		System.out.print(Billy.getString());

	}

}
