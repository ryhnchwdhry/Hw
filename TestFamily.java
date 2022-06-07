package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("Info01 >>>>>>>>>>>.");
		Daughter daughter = new Daughter();
		System.out.println("\nInfo002 >>>>>>>>>>>.");
		Daughter daughter1 = new Daughter("September", 22);
		System.out.println("\nInfo003 >>>>>>>>>>>.");
		Daughter daughter2 = new Daughter();
		daughter2.daughter();
		System.out.println("\nInfo003 >>>>>>>>>>>.");
		Daughter daughter3 = new Daughter();
		daughter2.daughterInfo("September", 22);

	}
}
