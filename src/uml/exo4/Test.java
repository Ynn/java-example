package uml.exo4;

public class Test {

	public static void main(String[] args) {
		Fichier f1 = new Fichier("fichier1");
		Repertoire r1 = new Repertoire("root");

		r1.addFichier(f1);

		System.out.println(r1);
	}

}
