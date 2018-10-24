package cours.equalshashcode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestAvecPoint {

	public static void traiteCollection(Collection<Point> c) {
		c.add(new Point(1, 1));
		c.add(new Point(1, 1));
		c.add(new Point(1, 1));

		c.add(new Point(0, 0));
		c.add(new Point(45, 45));
		c.add(new Point(62, 45));
		c.add(new Point(3, 5));

		System.out.printf("type = %s valeur = %s %n", c.getClass().getSimpleName(), c);
	}

	public static void main(String[] args) {
		// Une liste contient les elem dans l'ordre d'insersion
		// avec duplication possible
		List<Point> c = new ArrayList<>();
		traiteCollection(c);
		Set<Point> c2 = new HashSet<>();
		traiteCollection(c2);
		SortedSet<Point> c3 = new TreeSet<>();
		traiteCollection(c3);
	}

}
