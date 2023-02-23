package ch07StringOperations;
// StringImmutableTest.java
public class StringImmutableTestEx1 {

	public static void main(String[] args) {
		String str = "In Java Strings are immutable";
		str = str.concat(" all the time");
		System.out.println(str);
		System.out.println("So, a string can't be altered once it is created");
	}
}
