package cours.equalshashcode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestAvecChaine {

	public static void traiteCollection(Collection<String> c) {
		c.add("Toto");
		c.add("Toto");
		c.add("Titi");
		System.out.printf("type = %s valeur = %s %n", c.getClass().getSimpleName(), c);
	}

	public static void main(String[] args) {
		// Une liste contient les elem dans l'ordre d'insersion
		// avec duplication possible
		List<String> c = new ArrayList<>();
		traiteCollection(c);
		Set<String> c2 = new HashSet<>();
		traiteCollection(c2);
		Set<String> c3 = new TreeSet<>();
		traiteCollection(c3);

		// liste de notes (clef = String nom Etudiant, valeur = Integer note) :
		Map<String, Integer> notesParEtudiants = new HashMap<>();
		notesParEtudiants.put("Albert", 12);
		notesParEtudiants.put("John", 8);
		notesParEtudiants.put("Simon", 2);

		System.out.println("Notes de Simon =" + notesParEtudiants.get("Simon"));
		for (Map.Entry<String, Integer> clefValeur : notesParEtudiants.entrySet()) {
			System.out.println(clefValeur.getKey() + " a pour note : " + clefValeur.getValue());
		}
	}

}
