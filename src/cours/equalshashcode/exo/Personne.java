package cours.equalshashcode.exo;

public class Personne {
	private int age;
	private String nom;

	public Personne(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		return age + nom.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Personne) {
			Personne other = (Personne) obj;

			if (this.nom == null) {
				return other.nom == null;
			}

			return (this.age == other.age) && (this.nom.equals(other.nom));

		}

		return false;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
