import static java.lang.System.out;

public class For5 {
	public static void main(String args[]) {

		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < row; column++) {
				out.print("*");				
			}
		}
		out.println("");
	}

}
