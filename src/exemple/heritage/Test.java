package exemple.heritage;

import java.lang.reflect.Method;

public class Test {

	private static void afficherNom(Personne p) {
		System.out.println(p.getNom());
	}

	public static void main(String[] args) {
		Personne p = new Tricheur(19, "Jenifer");
		System.out.println(p.toString());

		if (p instanceof Malin) {
			((Malin) p).frimer();
		} else {
			System.out.println("Celui n'est pas malin");
		}

		afficherNom(p);

		System.out.println("----------------------- En mémoire :");
		System.out.println(p instanceof Object);

		System.out.println("La variable p est de type " + p.getClass());
		for (Method m : p.getClass().getMethods()) {
			System.out.println(m.getName() + " (" + m.getParameterCount() + " parametres)" + m.getDeclaringClass());
		}
		System.out.println("-----------------------");

		System.out.println("Affiche P :");
		System.out.println(p);

	}
}
