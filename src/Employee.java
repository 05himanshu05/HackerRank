
public class Employee {

	int employeeAge;
	public Employee(String ename) {
		System.out.println("Employee Name is " + ename);
	}
	
	public void setEmployeeAge(int eage) {
		employeeAge = eage;
	}
	
	private int getEmployeeAge() {
		System.out.println("Employee Age is " + employeeAge);
		
		return employeeAge;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Ramesh");
		
		e.setEmployeeAge(23);
		e.getEmployeeAge();
	}
}
