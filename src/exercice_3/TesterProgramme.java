package exercice_3;

import java.util.ArrayList;
import java.util.List;

public class TesterProgramme {
	public static void main(String[] args) {
        List<Personne> team = new ArrayList<>();
        team.add(new Developpeur("Salma", 5000));
        team.add(new Manager("Ahmed", 10000));
        team.add(new Developpeur("Hajar", 2200));

        Utils.listerPersonnes(team);
    }
}
