package lesson10.labs.Soln7_2;

public class Employee {
	String firstName, lastName;
	

	int salary;
	public Employee(String f, String l, int s) {
		this.firstName = f;
		this.lastName = l;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("first name: ");
		sb.append(firstName);
		sb.append(" last name: ");
		sb.append(lastName);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object emp) {
		if(emp == null) return false;
		if(!(emp instanceof Employee)) return false;
		Employee e = (Employee) emp;
		return e.getFirstName().equals(this.firstName) && e.getLastName().equals(this.lastName) && e.getSalary() == this.salary;
	}
	@Override
	public int hashCode() {
		return 17 + 31 + this.firstName.hashCode() + 31 + this.lastName.hashCode() + this.salary;
	}
}

