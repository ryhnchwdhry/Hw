package hw9Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	 * One keywords are used for the inheritance in Java for a regular Class which
	 * is extends. Yes a regular Class inherit other Abstract Class, a regular class
	 * can not be extends with interface by extends key word. One inheritances is
	 * possible by a regular Class?
	 */
	public void chemistry() {
		System.out.println("This is non abstract class");
	}

//	public abstract void biology (); A class that is declared using “abstract” keyword is known as abstract class
	public ColumbiaUniversity() {
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}
