package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {

		super("Rayhan", 23, 'M', false);
		super.father();
		super.fatherInfo("Rayhan", 23, 'M', false);
		super.FamilyName = "Rayhanc Family";

		System.out.println("Family name: " + FamilyName);

	}

	public Daughter(String birthMonth, int age) {
		super("Rayhan", 23, 'M', false);
		super.father();
		super.fatherInfo("Rayhan", 23, 'M', false);
		super.FamilyName = "Rayhanc Family";
		System.out.println("Family name: " + FamilyName);

		System.out.println("Birth Month: " + birthMonth + "Age: " + age);
	}

	public void daughter() {

		super.father();
		super.fatherInfo("Rayhan", 23, 'M', false);
		super.FamilyName = "Rayhanc Family";
		System.out.println("This is method from daughter class");

	}

	public void daughterInfo(String birthMonth, int age) {

		super.father();
		super.fatherInfo("Rayhan", 23, 'M', false);
		super.FamilyName = "Rayhanc Family";

		System.out.println("Birth Month " + birthMonth + "Age:" + age);
		System.out.println("This is peramitarized method from daughter class");
	}
}
