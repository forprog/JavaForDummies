package Chapter11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.allmycode.dummiesframe.DummiesFrame;

public class ShowGuestFrame {
	public static int guests[] = new int[10];

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner diskScanner = new Scanner(new File("GuestList.txt"));
		
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			guests[roomNum] = diskScanner.nextInt();
		}
		
		DummiesFrame frame = new DummiesFrame("Show guests");
		frame.addRow("Input room number");
		frame.go();
	}
	public static String calculate(String roomNumber) {
		int iRoomNumber = Integer.parseInt(roomNumber);
		return Integer.toString(guests[iRoomNumber]);
	}
}
