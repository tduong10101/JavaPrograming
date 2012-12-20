package basicJava;

public class RunComm {
	public static void main (String[] args){
		Commision1 test1 = new Commision1(10.0,10.0);
		Commision1 test2 = new Commision1(10.0,2000);
		System.out.println(test1.computeCommission(test1.saleFig, test1.doubCommRate));
		System.out.println(test2.computeCommission(test2.saleFig, test2.intCommRate));
		System.out.println(test2.computeCommission(test2.saleFig));
	}
}
