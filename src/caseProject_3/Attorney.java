package caseProject_3;

public class Attorney {
	private String lastName, firstName;
	private int attorneyID;
	private double salary;
	public Attorney(String lastName_, String firstName_,int attorneyID_, double salary_){
		lastName = lastName_;
		firstName = firstName_;
		attorneyID = attorneyID_;
		salary = salary_;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAttorneyID(){
		return attorneyID;
	}
	public void setAttorneyID(int attorneyID) {
		this.attorneyID = attorneyID;
	}
	public String toString(){
		return "Attorney ID: "+attorneyID+" Firstname: "+firstName+" Lastname: "+lastName+" Salary: $"+salary;
	}
}
