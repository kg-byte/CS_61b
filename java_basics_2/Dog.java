public class Dog {
	/* instance variable */
	public int size;
	/* static variable 
	Never change its a constant*/
	public static String binomen = "Canis familiaris";
	/* constructor similar to a method but not a method
		Determines how to instantiate the class */
	public Dog(int s) {
		size = s;
	}
	/* intance method aka non static method
	*/
	public void makeNoise() {
		if (size < 10) {
			System.out.println("yap");
		} else if (size < 30) {
			System.out.println("bark");
		} else {
			System.out.println("arooooooo");
		}
	}
	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.size > d2.size) {
			return d1;
		}
		return d2;
	}

	public Dog maxDog(Dog otherdog) {
		if (size > otherdog.size) {
			return this;
		}
		return otherdog;
	}
}