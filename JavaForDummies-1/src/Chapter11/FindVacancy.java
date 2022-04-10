package Chapter11;

import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FindVacancy {

	public static void main(String[] args) throws FileNotFoundException {
		int[] guests = FillRoomsFromFile.FillRooms();
		
		int roomNum = 0;
		while (roomNum < 10 && guests[roomNum] != 0) {
			roomNum++;
		}
		
		if (roomNum == 10) {
			out.println("Sorry, no available rooms");
		} else {
			out.print("How many guest will move in number ");
			out.print(roomNum);
			out.print("?");
			
			Scanner keyboard = new Scanner(System.in);
			guests[roomNum] = keyboard.nextInt();
			keyboard.close();
			
			PrintStream listOut = new PrintStream("GuestList.txt");
			for (int i = 0; i < guests.length; i++) {
				listOut.print(guests[i]);
				listOut.print(" ");
			}
			listOut.close();
		}
	}
}
