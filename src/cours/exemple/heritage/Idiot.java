package cours.exemple.heritage;

public class Idiot extends Personne {

	public Idiot(int age, String nom) {
		super(age, nom);
	}

	public void mangerSesCrottesDeNez() {
		System.out.println("miam !");
	}

	@Override
	public String toString() {
		return super.toString() + " est idiot(e)";
	}

}
