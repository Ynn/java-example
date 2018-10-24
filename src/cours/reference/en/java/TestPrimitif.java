package cours.reference.en.java;

public class TestPrimitif {

	public static void ajoute5(int pa) {
		pa = pa + 5;
		System.out.println("valeur de pa à la fin de la méthode " + pa);

	}

	public static void main(String[] args) {
		int b = 10;
		ajoute5(b);
		System.out.println("valeur de b à la fin de la méthode " + b);

	}
}