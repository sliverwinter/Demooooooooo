package singleton;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertSort {

	public static List<Integer> insertSort(final List<Integer> numbers) {
		final List<Integer> sortedList = new LinkedList<>();

		//?????????????????????????？？
		originalList: for (Integer number : numbers) {
			for (int i = 0; i < sortedList.size(); i++) {
				if (number < sortedList.get(i)) {
					sortedList.add(i, number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);

		}
		return sortedList;
	}

	public static void main(String[] args) {
		List<Integer> Integer = new ArrayList<Integer>();
		Integer.add(1);
		Integer.add(4);
		Integer.add(2);
		System.out.println(insertSort(Integer));
	}
}
