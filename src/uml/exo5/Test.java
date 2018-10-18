package uml.exo5;

public class Test {

	public static void main(String[] args) {
		Repertoire r1 = new Repertoire("/");
		Repertoire r2 = new Repertoire("home/");

		r1.addNode(r2);

		Fichier f1 = new Fichier("toto.txt");
		r2.addNode(f1);

		System.out.println(r1.toString());

	}

}
