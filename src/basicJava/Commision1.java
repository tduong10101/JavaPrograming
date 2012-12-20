package basicJava;


public class Commision1 {

	double saleFig;
	double doubCommRate;
	int intCommRate;
	
	public Commision1(double saleFig, double doubCommRate){
		this.saleFig = saleFig;
		this.doubCommRate = doubCommRate;
	}
	public Commision1(double saleFig, int intCommRate){
		this.saleFig = saleFig;
		this.intCommRate = intCommRate;
	}
	
	public double computeCommission (double saleFig1, double doubCommRate1){
			return saleFig1*doubCommRate1;
	}
	public double computeCommission (double saleFig1, int intCommRate1){
		return (intCommRate1/100)*saleFig1;
	}
	public double computeCommission (double saleFig1){
		return saleFig1*7.5;
	}
	
}

