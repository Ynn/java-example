package cours.equalshashcode.exo;

public class Test {
	public static void main(String[] args) {
		Personne p1 = new Personne(14, new String("Toto"));
		Personne p2 = new Personne(14, new String("Toto"));
		System.out.println(p1.equals(p2));
	}
}
