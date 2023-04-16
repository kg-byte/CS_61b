import java.util.List;
import java.util.ArrayList;


public class ListLauncher {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println(ListExercises.sum(list1));
		System.out.println(ListExercises.evens(list1));

		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(ListExercises.sum(list1));
		System.out.println(ListExercises.evens(list1));

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		List<Integer> list3 = new ArrayList<Integer>();
		list2.add(3);

		System.out.println(ListExercises.common(list1, list2));
		System.out.println(ListExercises.common(list1, list3));


		List<String> list4 = new ArrayList<String>();
		System.out.println(ListExercises.countOccurrencesOfC(list4, "kaki"));

		list4.add("kaki");
		list4.add("tino");
		list4.add("kaki");
		list4.add("MM");
		System.out.println(ListExercises.countOccurrencesOfC(list4, "kaki"));
		System.out.println(ListExercises.countOccurrencesOfC(list4, "tino"));
		System.out.println(ListExercises.countOccurrencesOfC(list4, "MM2"));

	}
}
