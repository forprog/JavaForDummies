package Chapter11;

import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowGuests {

	public static void main(String[] args) throws FileNotFoundException {
		int guests[] = new int[10];
		Scanner diskScanner = new Scanner(new File("GuestList.txt"));
		
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			guests[roomNum] = diskScanner.nextInt();
		}
		
		out.println("Room\tGuests");
		for (int roomNum = 0; roomNum < guests.length; roomNum++) {
			out.print(roomNum);
			out.print("\t");
			out.println(guests[roomNum]);
		}
		
		diskScanner.close();
	}

}
