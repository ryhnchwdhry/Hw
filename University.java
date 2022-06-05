package hw9Abstraction;

public interface University {
	public void classSize();

	public void playGround();

	public void teacher();

//	public University() {} cannot have a constructor within an interface in Java

	public default void gymnasium() {
	}

	public static void library() {
	}
}
