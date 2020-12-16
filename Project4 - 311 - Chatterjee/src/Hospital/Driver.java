package Hospital;

public class Driver {

	public static void main(String[] args) {
		createPatients();
		//runSimulation();
	}
	
	public static void createPatients() {
		
		int timePeriod = 60;
		String sickness[] = {"heart attack","deep cut","stomach ache","minor cut","flu","headache","broken limb"};
		
		DHArrayList<Patient> Patients = new DHArrayList<Patient>();
		
		Patient patient1 = new Patient("Jim","Dandy",sickness[0],"2pm",1);
		Patient patient2 = new Patient("Jack","",sickness[1],"4pm",2);
		Patient patient3 = new Patient("George","Castello",sickness[2],"11am",3);
		
		Patient patient4 = new Patient("Lala","Dandy",sickness[3],"2pm",1);
		Patient patient5 = new Patient("Rinaldo","Dandy",sickness[4],"4pm",2);
		Patient patient6 = new Patient("Marcus","Castello",sickness[5],"11am",3);
		
		Patient patient7 = new Patient("Alfred","Dandy",sickness[6],"2pm",1);
		Patient patient8 = new Patient("Alex","Dandy",sickness[6],"4pm",2);
		Patient patient9 = new Patient("Horst","Castello",sickness[5],"11am",3);
		
		Patient patient10 = new Patient("Finn","Dandy",sickness[0],"2pm",1);
		Patient patient11 = new Patient("","Dandy",sickness[4],"4pm",2);
		Patient patient12 = new Patient("George","Castello",sickness[6],"11am",3);
		
		Patient patient13 = new Patient("Jim","Dandy",sickness[6],"2pm",1);
		Patient patient14 = new Patient("Jack","Dandy",sickness[3],"4pm",2);
		Patient patient15 = new Patient("George","Castello",sickness[1],"11am",3);
		
		Patients.add(patient1);
		Patients.add(patient2);
		Patients.add(patient3);
		Patients.add(patient4);
		Patients.add(patient5);
		Patients.add(patient6);
		Patients.add(patient7);
		Patients.add(patient8);
		Patients.add(patient9);
		Patients.add(patient10);
		Patients.add(patient11);
		Patients.add(patient12);
		Patients.add(patient13);
		Patients.add(patient14);
		Patients.add(patient15);
		
		
		System.out.println(Patients.get(0).fname);
	}
}