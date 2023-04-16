public class LargerDemo {
	/** returns the larger of x and y. */
	public static int larger(int x,int y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	public static void main(String[] args) {
		System.out.println(larger(-5,10));
	}
}

/*
1. funtions must be declared as a part of a class in Java.
	A function that is a part of a lcass is called 'method'. 
	so in Java, all functions are methods.
2. To define a function in Java, we use 'public static'. 
	We will see alternate ways of defining functions later.
3. all parameters of a function must have a declaered type and the return value of the function must
	have a declared type
4. functions in Java return only one value!
*/