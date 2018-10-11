package uml.exo2;

public class Test {
	public static void main(String[] args) {
		Etat france = new Etat("Paris", "France");
		Etat espagne = new Etat("Madrid", "Espagne");
		System.out.println(france);
		System.out.println(espagne);
		espagne.ajouterVoisin(france);
		System.out.println(france);
		System.out.println(espagne);

	}

}
