package employeeShower;

public abstract class Employee {
	
	private Integer id;
	
	private String name;
	
	private String department;
	
	private boolean working;

	public Employee(Integer id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}
	
	abstract void performDuties();
	
}
