package exercice_1;

public class Cercle extends Forme {
private double rayon;
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	@Override
	double getSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}
	@Override
	public String toString() {
		return "la surface du cercle est" + rayon;
	}

}
