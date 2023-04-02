Java and Object Orientation
------------------------------
	Java is an object oriented language with strict requirements:
		1. Every Java file must contain a class declaration(*).
		2. All code lives inside a class(*), even helper functions, global constants, etc.
		3. To run a Java program, you typically define a main method using
			public static void main(String[] args)


		*: this is not completely true, e.g. we can also declare 'interfaces' in .Java files that may contain code. More on this later.


Java and Static Typing
-----------------------------
Java is statically typed!
	1. All variables, parameters, and methods must have a declared type.
	2. That type can never change.
	3. Expression also have a type.
	4. The complier checks that all the types in your program are compatible BEFORE the program even runs!
		This is unlike a language like Python, where type checks are performed DURING execution.


Reflection on Static Typing
------------------------------
The Good:
	1. Catches certain types of errors, making it easier on the programmer to debug their code.
	2. Type errors can (almost) never occur on the ned user's computer.
	3. Makes it easier to read and reason about code.
	4. Code can run more efficiently. e.g. no need to do expensive runtime type checks.

The Bad
	1. Code is more verbose.
	2. Code is less genral. e.g. Larger can only compare intgers but not other types.
		There is a way around this in Java (generics).