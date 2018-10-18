package exemple.heritage;

public class Malin extends Personne {

	public Malin(int age, String nom) {
		super(age, nom);
		System.out.println("Construit le malin");
	}

	public void frimer() {
		System.out.println("Nanananare, je suis genial");
	}

	@Override
	public String toString() {
		return super.toString() + " est mali(n/gne)";
	}

}
