package Chapter11;

import static java.lang.System.out;

import java.io.FileNotFoundException;

public class ShowGuests2 {

	public static void main(String[] args) throws FileNotFoundException {
		int guests[] = {1,4,2,0,2,1,4,3,0,2};
		int roomNum = 0;
		
		out.println("Room\tGuests");
		for (int numGuests : guests) {
			out.print(roomNum++);
			out.print("\t");
			out.println(numGuests);
		}
	}

}
