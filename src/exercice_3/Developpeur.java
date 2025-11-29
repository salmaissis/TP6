package exercice_3;

public class Developpeur extends Personne{

	public Developpeur(String nom, double salaireBase) {
		super(nom, salaireBase);
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return salaireBase * 1.10;
	}

}
