package equalshashcode.exo;

public class Test {
	public static void main(String[] args) {
		Personne p1 = new Personne(14, "Toto");
		Personne p2 = new Personne(14, "Toto");

		System.out.println(p1.equals(p2));
	}
}
