import javax.swing.JOptionPane; 

public class Authentificator {

	public static void main(String args[]) {
		
		String userName = JOptionPane.showInputDialog("Имя пользователя: ").toUpperCase();
		String password = JOptionPane.showInputDialog("Пароль: ").toUpperCase();
		
		if (userName != null &&  password != null && (
				(userName.equals("BBURD") && password.equals("SWORDFISH")) || 
				(userName.equals("HRITTER") && password.equals("PREAKSTON")))) {
			JOptionPane.showMessageDialog(null, "Вы допущены в систему");
		} else {
			JOptionPane.showMessageDialog(null, "Попытайтесь еще раз ...");
		}
	}
}
