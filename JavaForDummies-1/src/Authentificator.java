import javax.swing.JOptionPane; 

public class Authentificator {

	public static void main(String args[]) {
		
		String userName = JOptionPane.showInputDialog("��� ������������: ").toUpperCase();
		String password = JOptionPane.showInputDialog("������: ").toUpperCase();
		
		if (userName != null &&  password != null && (
				(userName.equals("BBURD") && password.equals("SWORDFISH")) || 
				(userName.equals("HRITTER") && password.equals("PREAKSTON")))) {
			JOptionPane.showMessageDialog(null, "�� �������� � �������");
		} else {
			JOptionPane.showMessageDialog(null, "����������� ��� ��� ...");
		}
	}
}
