import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {
	public SimpleFrame() {
		setTitle("Don't click the button!");
		//setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Click me!"));
		setSize(300,100);
		setVisible(true);
	}
}
