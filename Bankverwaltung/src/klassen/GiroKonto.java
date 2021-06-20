package klassen;

public class GiroKonto extends KontoStamm {
	private double dispo;
	private double sollzins;


	
	public double getDispo() {
		return dispo;
	}

	public void setDispo(double dispo) {
		this.dispo = dispo;
	}

	public double getSollzins() {
		return sollzins;
	}

	public void setSollzins(double sollzins) {
		this.sollzins = sollzins;
	}

}
