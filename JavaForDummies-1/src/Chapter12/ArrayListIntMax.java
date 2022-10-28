package Chapter12;

import java.util.ArrayList;

public class ArrayListIntMax {

	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<>();
		arList.add(85);
		arList.add(19);
		arList.add(0);
		arList.add(103);
		arList.add(13);

		Integer max = Integer.MIN_VALUE;
		for (Integer curVal : arList) {
			if (max < curVal) {
				max = curVal;
			}
		}
		
		System.out.println(max);
	}

}
