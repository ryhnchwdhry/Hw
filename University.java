package hw9Abstraction.copy;

public interface University extends College {
	/*
	 * There are two main keywords, “extends” and “implements” which are used in
	 * Java for inheritance. Yes interface inherit other Interfaces, , Yes a regular
	 * class or abstract class by extends key word? One inheritance is possible
	 * between class and abstract class, but interface extends one or more.
	 */

	public void classSize();

	public void playGround();

	public void teacher();

//	public University() {} cannot have a constructor within an interface in Java

	public default void gymnasium() {
	}

	public static void library() {
	}
}
