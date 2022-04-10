package Chapter11;

import static java.lang.System.out;
import java.io.FileNotFoundException;

public class ShowRooms {

	public static void main(String[] args) throws FileNotFoundException {
		
		Room rooms[] = FillRoomArrayFromFile.FillRooms();
		
		out.println("Room\tGuests\tRate\t\tSmoking");
		for (int roomNum = 0; roomNum < rooms.length; roomNum++) {
			Room room = rooms[roomNum];
			out.print(roomNum);
			out.print("\t");
			room.writeRoom();
		}
	}

}
