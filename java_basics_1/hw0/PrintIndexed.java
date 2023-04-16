public class PrintIndexed {
	public static String printIndexed(String x) {
	String y = "";
	int length = x.length();
	for (int index = 0; index < length; index++) {
	    y = x.substring(x.length() - 1) +index + y;
	    x = x.substring(0, x.length() -1);
		}
	return y;
	}
	public static void main(String[] args) {
		System.out.println(printIndexed("ZELDA"));
	}
}

/* 
input 'ZELDA'
OUTPUT 'Z4E3L2D1A0'

Alternate answer
def printIndexed(s):
    output = ""
    for i in range(len(s)):
        output += s[i]
        output += str(len(s) - 1 - i)
    print(output)
*/