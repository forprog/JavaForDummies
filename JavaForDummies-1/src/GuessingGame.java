import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("������� ����� �� 1 �� 10: ");
		
		int inputNumber = keyboard.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
		
		if (inputNumber == randomNumber) {
			out.println("*************");
			out.println("*�� ��������*");
			out.println("*************");
		} else {
			out.println("�� ���������");
			out.print("��������� ����� ����� ");
			out.println(randomNumber);
		}
		
		out.println("������� �� ����");
		
		keyboard.close();
	}
}
