package Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class FillRoomArrayFromFile {
	public static Room[] FillRooms() throws FileNotFoundException {
		Room rooms[] = new Room[10];
		Scanner diskScanner = new Scanner(new File("RoomList.txt"));
		diskScanner.useLocale(Locale.US);
		
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			rooms[roomNum] = new Room(); 
			rooms[roomNum].readRoom(diskScanner);
		}
		diskScanner.close();
		return rooms;
	}
}
