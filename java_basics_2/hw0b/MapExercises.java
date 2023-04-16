import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;





public class MapExercises {
	public static Map<String, Integer> letterToNum() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Map<String, Integer> alp = new HashMap<>();
		for (int i = 0; i < alphabet.length(); i++) {
            alp.put(""+alphabet.charAt(i), i+1);
        }
        return alp;
	}

	public static Map<Integer, Integer> squares(List<Integer> L) {
		int size = L.size();
		Map<Integer, Integer> squares = new HashMap<>();

		if (size == 0) {
			return squares;
		}
		else {
			for (int i : L) {
				squares.put(i, i*i);
			}
			return squares;
		}
	}

	public static Map<String, Integer> countWords(List<String> words) {
		int size = words.size();
		Map<String, Integer> mapWords = new HashMap<>();

		if (size == 0) {
			return mapWords;
		}
		else {
			for (String word : words) {
				if (mapWords.containsKey(word)) {
					mapWords.put(word, mapWords.get(word) + 1);
				}
				else {
					mapWords.put(word, 1);
				}
				
			}
			return mapWords;
		}
	}

	public static void main(String[] args) {
		System.out.println(MapExercises.letterToNum());


		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(MapExercises.squares(list1));

		List<String> list2 = new ArrayList<String>();
		list2.add("kaki");
		list2.add("tino");
		list2.add("kaki");
		list2.add("MM");
		System.out.println(MapExercises.countWords(list2));


	}

}
