public class DogLauncher {
	public static void main(String[] args) {
		Dog tino = new Dog(50);
		Dog charlie = new Dog(10);
		tino.makeNoise();
		charlie.makeNoise();
		Dog.maxDog(tino, charlie).makeNoise();
		tino.maxDog(charlie).makeNoise();
		System.out.println(Dog.binomen);
	}

}