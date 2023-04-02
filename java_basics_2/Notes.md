Java Class
---------------------------
public class Dog {
	public static void makeNoise() {
		System.out.println("bark");
	}
<!-- 	public static void main(String[] args) {
		makeNoise();
	} -->
}

public class DogLauncher {
	public static void main(String[] args) {
		Dog.makeNoise();
	}
}




1. every method (aka function) is associated with some class
2. To run a class, we must define a main method.
	Not all classes have a main method!
3. Unlike python, there's no need to import if the two files are in the same project.
4. void method do can't be run directly since there's no main method
5. main method can call from another class
6. static methods are invoked using class name, e.g. Dog.makeNoise();
7. instance methods are invoked using an instance name, e.g. tino.makeNoise();
8. static methods can't access 'my' instance vriables, because there's no 'me'


Static vs Non-static
-------------------------
A class may have a mix of static and non-static members:
	1. A variable or method defined in a class is also called a member of a class.
	2. Static members are accessd using class name, e.g. Dog.binomen
	3. Non-static memebrs cannot be invoked using class name: e.g. Dog.size (no)
	4. Static methods must access instance variable via a specific instance. e.g. d1; otherdog.


Abstract Data Types vs. Concrete Implementations
---------------------------------------------------------
1. Another term used for List in Java is "abstract data type"
	Any list is guaranteed to have at least the operations in 
	https://docs.oracle.com/javase/8/docs/api/java/util/List.html
2. Each implementation, e.g. LinkedList is known as 'concrete implementation'
	Code for different types of list may be radically different
	All concrete implementations have at least the operations guaranteed by every List
3. Why bother having multiple concrete implementations of an abstract data type?
	May have better performance in certain cases. e.g.
		LinkeLists are very fast at removing the front item. ArrayList are very slow to revmove the front item.
	May have additional operations. e.g.
		The Stack impelmentation of List has a 'push' and 'pop' operation.
4. Limitations. Going from Java 4.0-> 5.0 listls meant losing the ability to have lists with multiple types.
	Why might be a good thing?
		It restrics the set of choices you have to make as a programmer.
	Placing limitations on yourself as a programmer is a good thing!
		Freedom leasds to complexity.
		Complexity is hard to fit in brain.
		Java has many features that help you restrict yourself.
		Will be a recurring theme in this class.


Arrays
--------------------
Java has a special collection called an 'array' that is restricted version of the list ADT.
1. Size that must be declared at the time the array is created.
2. Size cannot change.
3. All items must be of the same type.
4. No methods.
5. Syntax for accessing array entires is similar to Python, e.g. x[0]

No python equivalent.
Why use array?
1. Arrays are more performant:
	Reading and writing from them is faster.
	Use less memory.
Why arrays are the favorite child in Java and list the favorite child in python x[0] special notation.
1. Java is a language built for performance; by contrast, Python is built to be builtiful/simple/elegant.
2. in 61C, you'll learn C:
	C is uglier than Java.
	C is more oriented around performance.


Maps
---------------------
In programming lanagues, a map is a collection of k-v pairs. Each key is guaranteed to be unique. Also called:
	Dictionary(in Python)
	Associative Array (in theoretical computer science)
e.g. {"alpha": "first letter of greek alphabet", 
	  "potato": "a starchy edible plant"}
