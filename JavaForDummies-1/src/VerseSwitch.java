import static java.lang.System.out;
import java.util.Scanner;

public class VerseSwitch {
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		out.print("������ �� ����� ��� ������ (����, ��� ��� ���)?");
		String verse = keyboard.next();
		
		switch (verse) {
		case "����":
			out.println("������ ��� ����� ���� ����� �����");
			break;
		case "���":
			out.println("������ ��� �� ����� ���������");
			break;
		case "���":
			out.println("������ ��� �� ��� ����� ��� ������");
			break;
		default:
			out.println("����� ������� ���");
			break;
		}
				
		out.println("�-�-�-�-�����");
		
		keyboard.close();
		
	}
}
