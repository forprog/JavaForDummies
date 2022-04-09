package Chapter10;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TeamFramePlus extends JFrame {
	public TeamFramePlus() throws FileNotFoundException {
		PlayerPlus player;
		Scanner hankeesData = new Scanner(new File("Hankees.txt"));
		hankeesData.useLocale(Locale.US);

		for (int num = 1; num <= 9; num++) {
			player = new PlayerPlus(hankeesData.nextLine(),hankeesData.nextDouble());
			hankeesData.nextLine();
			addPlayerInfo(player);
		}
		
		add(new JLabel());
		add(new JLabel(" -------"));
		add(new JLabel("Team average batting:"));
		add(new JLabel(PlayerPlus.findTeamAverageString()));
		
		setTitle("Hank's average battings");
		setLayout(new GridLayout(11,2,20,3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		hankeesData.close();
	}

	private void addPlayerInfo(PlayerPlus player) {
		add(new JLabel(" "+player.getName()));
		add(new JLabel(player.getAverageString()));
	}
}
