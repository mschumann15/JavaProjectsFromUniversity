package Hospital;

public class Patient {
	
	public Patient(String fname, String lname, String condition,String arrivalTime,int urgency) {
		
		this.fname = fname;
		this.lname = lname;
		this.condition = condition;
		this.arrivalTime = arrivalTime;
		//this.timeAttended = timeAttended;
		this.urgency = urgency;
	
	}

	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public String getTimeAttended() {
		return timeAttended;
	}
	
	public void setTimeAttended(String timeAttended) {
		this.timeAttended = timeAttended;
	}
	
	public int getUrgency() {
		return urgency;
	}
	
	public void setUrgency(int urgency) {
		this.urgency = urgency;
	}

	protected String fname;
	protected String lname;
	protected String condition;
	protected String arrivalTime;
	protected String timeAttended;
	protected int urgency; // 1 heart attack, 20 minor cut
}
