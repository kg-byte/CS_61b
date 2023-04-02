public class StarTriangle {
	public static void main(String[] args) {
		int x = 0;
		String y = "*";
		while(x < 5) {
			System.out.println(y);
			x = x + 1;
			y = y + "*";
		}
	}
}

/* output
*
**
***
****
*****

Alternate answer:
for i in range(5):
    line = ""
    for j in range(i + 1):
        line += "*"
    print(line)
*/