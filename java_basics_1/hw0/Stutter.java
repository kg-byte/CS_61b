public class Stutter {
	public static String stutter(String x) {
	String y = "";
	int length = x.length();
	for (int index = 0; index < length; index++) {
	    y = y + x.substring(index, index+1).repeat(2);
		}
	return y;
	}
	public static void main(String[] args) {
		System.out.println(stutter("Hello!"));
	}
}

/* 
input 'Hello!'
OUTPUT 'HHeelllloo!!'
*/