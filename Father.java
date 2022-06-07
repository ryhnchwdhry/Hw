package hw10UseOfSuperInChildClass;

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	public Father() {
		System.out.println("This is default constructor from father class");
	}

	public Father(String Name, int age, char sex, boolean usCitizen) {

		System.out.println("Name: " + Name + " Age: " + age + " Sex: " + sex + " UsCitizen: " + usCitizen);
		System.out.println("This isperamitarized constructor from father class");
	}

	public void father() {
		System.out.println("This is a void type method from father class");
	}

	public void fatherInfo(String Name, int age, char sex, boolean usCitizen) {

		System.out.println(" Name: " + Name + " Age: " + age + " Sex: " + sex + " UsCitizen: " + usCitizen);
		System.out.println("This is method from father class");
	}
}
