package employeeShower;

public class EmergencyRoomProcess {

	public static void main(String[] args) {		
		HospitalManagement hm = new HospitalManagement();
		Employee peggy = new Nurse(12, "Peggy", "emergency", true);
		Employee john = new Doctor(15, "John", "emergency", true);
		
		hm.callUpon(peggy);
		
		System.out.println("--------------------------------------");
		hm.callUpon(john);
	}

}
