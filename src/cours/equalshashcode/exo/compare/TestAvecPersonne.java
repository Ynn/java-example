package cours.equalshashcode.exo.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestAvecPersonne {

	public static void traiteCollection(Collection<Personne> c) {
		c.add(new Personne(45, "John"));

		c.add(new Personne(1, "John"));
		c.add(new Personne(19, "Sarah"));
		c.add(new Personne(1, "John"));

		System.out.printf("type = %s valeur = %s %n", c.getClass().getSimpleName(), c);
	}

	public static void main(String[] args) {
		// Une liste contient les elem dans l'ordre d'insersion
		// avec duplication possible

		List<Personne> c = new ArrayList<>();
		traiteCollection(c);
		Set<Personne> c2 = new HashSet<>();
		traiteCollection(c2);
		SortedSet<Personne> c3 = new TreeSet<>();
		traiteCollection(c3);

	}

}
