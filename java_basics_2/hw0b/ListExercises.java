import java.util.List;
import java.util.ArrayList;


public class ListExercises {
	public static int sum(List<Integer> L) {
		int size = L.size();
		int sum = 0;

		if (size == 0) {
			return sum;
		} else {
			for (int i : L) {
				sum+=i;
			}
			return sum;

		}
	}

	public static List<Integer> evens(List<Integer> L) {
		int size = L.size();
		List<Integer> elist = new ArrayList<Integer>();

		if (size == 0) {
			return L;
		} else {
			for (int i : L) {
				if (i % 2 == 0) {
					elist.add(i);
				}

			}
			return elist;

		}
	}

	public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
		int size1 = L1.size();
		int size2 = L2.size();
		List<Integer> clist = new ArrayList<Integer>();
	
		if (size1 == 0 && size2 == 0) {
			return clist;
		} else {
			if (size1 >= size2) {
				for (int i : L1) {
					if (L2.contains(i)) {
						clist.add(i);
					}
				}
			}
			else {
				for (int i : L2) {
					if (L1.contains(i)) {
						clist.add(i);
					}
				}
			}
		}
		return clist;
	}

	public static int countOccurrencesOfC(List<String> L, String words) {
		int size = L.size();
		int occurance = 0;

		if (size == 0) {
			return occurance;
		} else {
			for (String i : L) {
				if (i == words) {
					occurance += 1;
				}
			}
			return occurance;

		}
	}

}
