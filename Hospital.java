package hw9Abstraction.copy;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {

	}

	public static void pharmacy() {

	}
}
