package exercice_1;

public class TestFormes {
	public static void main(String[] argv) {
		Forme[] figures = new Forme[3];
		figures[0] = new Carre(2);
		figures[1] = new Cercle(3);
		figures[2] = new Carre(5.2);
		for (int i = 0; i < figures.length; i++)
			System.out.println(figures[i] + " : surface = " + figures[i].getSurface() + "cm2");
	}
}
