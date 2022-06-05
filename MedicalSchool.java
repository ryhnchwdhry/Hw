package hw9Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool {

	/*
	 * One keyword which is extends. Yes Abstract Class inherit other Abstract Class
	 * or a regular class by extends keyword. Only one inheritances is possible by
	 * an Abstract Class?
	 */

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract method");
	}

	public MedicalSchool() {
	}
}
