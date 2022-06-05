package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmName("Rayhan");
		employee.setAge(23);
		employee.setSex('M');
		employee.setUsCitizen(false);
		System.out.println("Employee Name is: " + employee.getEmName() + "\nAge : " + employee.getAge() + "\nSex : "
				+ employee.getSex() + "\nUscitizen : " + employee.isUsCitizen());

	}

}
