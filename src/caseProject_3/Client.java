package caseProject_3;

public class Client {
	private String lastName, firstName;
	private int clientID, attorneyID;
	private double balance;
	
	public Client(String lastName_, String firstName_, int clientID_, Attorney attorney_, double balance_){
		lastName = lastName_;
		firstName = firstName_;
		clientID = clientID_;
		attorneyID = attorney_.getAttorneyID();
		balance = balance_;
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

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public int getAttorneyID() {
		return attorneyID;
	}

	public void setAttorneyID(int attorneyID) {
		this.attorneyID = attorneyID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString(){
		return "Client ID: "+clientID+" Firstname: "+firstName+" Lastname: "+lastName+" "+" Primary attorney ID: "+attorneyID+" Balance: $"+balance;
	}
}
