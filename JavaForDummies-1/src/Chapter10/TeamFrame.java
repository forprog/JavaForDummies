package Chapter10;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {
	public TeamFrame() throws FileNotFoundException {
		Player player;
		Scanner hankeesData = new Scanner(new File("Hankees.txt"));
		hankeesData.useLocale(Locale.US);
		
		for (int num = 1; num <= 9; num++) {
			player = new Player(hankeesData.nextLine(),hankeesData.nextDouble());
			hankeesData.nextLine();
			addPlayerInfo(player);
		}
		setTitle("Hank's average battings");
		setLayout(new GridLayout(9,2,20,3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		hankeesData.close();
	}

	private void addPlayerInfo(Player player) {
		add(new JLabel(" "+player.getName()));
		add(new JLabel(player.getAverageString()));
	}
}
