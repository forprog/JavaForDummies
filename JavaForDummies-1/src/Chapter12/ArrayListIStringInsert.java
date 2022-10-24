package Chapter12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIStringInsert {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Зебра");
		arrList.add("Кошка");
		arrList.add("Лошадь");
		arrList.add("Собака");

		arrList = addStringToArrayList("рыба", arrList);
		
		for (String curVal : arrList) {
			System.out.println(curVal);
		}
	}

	public static ArrayList<String> addStringToArrayList(String strToAdd, ArrayList<String> arrList) {
		int curPosition = 0;
		ArrayList<String> retVal = new ArrayList<>(arrList);
		while (curPosition < retVal.size()) {
			String curVal = retVal.get(curPosition);
			if (curVal.compareToIgnoreCase(strToAdd) > 0) {
				break;
			}
			curPosition++;
		}
		retVal.add(curPosition,strToAdd);
		
		return retVal;
	}
}
