package klassen;

import java.util.Date;

public class Sparkonto extends KontoStamm {
	private double habenzins;
	private double kuendenbetrag;
	private Date kuendedatum;
	
	public double getHabenzins() {
		return habenzins;
	}
	public void setHabenzins(double habenzins) {
		this.habenzins = habenzins;
	}
	public double getKuendenbetrag() {
		return kuendenbetrag;
	}
	public void setKuendenbetrag(double kuendenbetrag) {
		this.kuendenbetrag = kuendenbetrag;
	}
	public Date getKuendedatum() {
		return kuendedatum;
	}
	public void setKuendedatum(Date kuendedatum) {
		this.kuendedatum = kuendedatum;
	}
	

}
