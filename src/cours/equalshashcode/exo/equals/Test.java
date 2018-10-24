package cours.equalshashcode.exo.equals;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	public static void main(String[] args) {
		Personne p1 = new Personne(14, new String("Toto"));
		Personne p2 = new Personne(14, new String("Toto"));
		System.out.println(p1.equals(p2));

	}
}
