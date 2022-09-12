package Chapter11;

public class Student {
	String name;
	int ID;
	double GPA;
	Majors Major;
	double[] Grades;

	public Student(String name, int ID) {
		this.name = name;
		this.ID = ID;
	} 

	public Student(String name,int ID,double GPA) {
		this.name = name;
		this.ID = ID;
		this.GPA = GPA;
	} 

	public Student(String name,int ID,double GPA,Majors Major) {
		this.name = name;
		this.ID = ID;
		this.GPA = GPA;
		this.Major = Major;
	} 

	public Student(String name,int ID,Majors Major) {
		this.name = name;
		this.ID = ID;
		this.Major = Major;
	} 

	public Student(String name,int ID,double GPA,Majors Major,double[] Grades) {
		this.name = name;
		this.ID = ID;
		this.GPA = GPA;
		this.Major = Major;
		this.Grades = Grades;
	}
	
	public double getGPA() {
		double GPA = 0;
		int divisor = 0;
		for (double d : Grades) {
			divisor++;
			GPA += d;
		}
		if (divisor > 0) {
			return GPA/divisor;
		} else {
			return 0;
		}
	}
	
	public String getString() {
		return this.name + " " + this.ID + " GPA: "+getGPA();
	}
}
