package cours.equalshashcode.exo;

public class Personne implements Comparable<Personne> {
	private int age;
	private String nom;

	public Personne(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		return nom.hashCode();
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

	@Override
	public String toString() {
		return "[age=" + age + ", nom=" + nom + "]";
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int compareTo(Personne o) {
		if (this.equals(o)) {
			// quand les objets sont égaux, alors 0 :
			return 0;
		}
		// Compare d'abord sur le nom :
		if (this.nom.equals(o.nom)) {
			// Si les noms sont égaux, alors je dois comparer sur l'age :
			// si mon age est plus grand alors positif
			// si mon age est le même alors 0
			// si mon age est plus petit alors négatif

			if (this.age > o.age) {
				return 1;
			} else if (this.age == o.age) {
				return 0;
			} else {
				return -1;
			}

			// ou simplement return this.age - o.age;
		} else {
			// les noms ne sont pas égaux :
			// je peux renvoyer l'ordre alpha
			// c'est a dire le résultat de la comparaison des noms :
			// compareTo de la classe String
			return this.nom.compareTo(o.nom);
		}
	}

}
