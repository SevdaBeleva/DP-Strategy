package employee;

public class Nurse extends Employee {

	public Nurse(Integer id, String name, String department, boolean working) {
		super(id, name, department, working);
	}
	

	private void checkVitalSigns() {
		System.out.println("Checking vital signs!");
	}
	
	private void drawBlood() {
		System.out.println("Drawing blood!");
	}
	
	private void cleanPatientArea() {
		System.out.println("Cleaning patient area!");
	}

	@Override
	void performDuties() {
		System.out.println("Nurse in action:");
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
	}

}
