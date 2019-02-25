package employeeShower;

public class Doctor extends Employee {

	public Doctor(Integer id, String name, String department, boolean working) {
		super(id, name, department, working);		
	}
	
	
	private void prescribeMedicine() {
		System.out.println("Prescribe medicine!");
	}
	
	private void diagnosePatients() {
		System.out.println("Diagnosing patients!");
	}

	@Override
	void performDuties() {
		System.out.println("Doctor in action:");
		prescribeMedicine();
		diagnosePatients();
	}

}
