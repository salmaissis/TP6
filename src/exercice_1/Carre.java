package exercice_1;

public class Carre extends Forme {
	private double cote;

	public Carre(double cote) {
		this.cote = cote;
	}
	@Override
	public String toString() {
		return " la cote du carre est: " + cote;
	}
	@Override
	double getSurface() {
		
		return this.cote * this.cote;
	}

}
