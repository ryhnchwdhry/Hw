package hw9Abstraction.copy;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {

	}

	public static void studyRoom() {

	}
}
