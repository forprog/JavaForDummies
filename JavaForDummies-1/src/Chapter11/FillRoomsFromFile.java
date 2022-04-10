package Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillRoomsFromFile {
	public static int[] FillRooms() throws FileNotFoundException {
		int guests[] = new int[10];
		Scanner diskScanner = new Scanner(new File("GuestList.txt"));
		
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			guests[roomNum] = diskScanner.nextInt();
		}
		diskScanner.close();
		return guests;
	}
}
