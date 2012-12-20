package caseProject_3;

public class LawFirm {

	public static void main(String[] args) {
		Attorney attorney1 = new Attorney("Farrell","Joyce", 1039474, 50000);
		Client client1 = new Client("Duong","Terry",99269474,attorney1,3000);
		System.out.println(client1.toString());
		System.out.println(attorney1.toString());
	}	
}
