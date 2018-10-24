package cours.exemple.heritage;

public class Tricheur extends Idiot {

	public Tricheur(int age, String nom) {
		super(age, nom);
	}

	@Override
	public String getNom() {
		return super.getNom() + " le tricheur";
	}

	public void triche() {
		System.out.println("triche triche");
	}

	@Override
	public String toString() {
		return super.toString() + " et tricheur aussi";
	}

}
