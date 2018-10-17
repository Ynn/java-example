package uml.exo3;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	private String nom;
	private int age;

	private List<University> studyingUni;
	private List<University> teachingUni;

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		this.studyingUni = new ArrayList<University>();
		this.teachingUni = new ArrayList<University>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void teachAt(University u) {
		if (!teachingUni.contains(u)) {
			this.teachingUni.add(u);
			u.addTeacher(this);
		}
	}

	@Override
	public String toString() {
		List<String> teachingUniNames = new ArrayList<>();
		for (University u : teachingUni) {
			teachingUniNames.add(u.getNom());
		}

		List<String> studyUniNames = new ArrayList<>();
		for (University u : studyingUni) {
			studyUniNames.add(u.getNom());
		}
		return String.format("nom=%s, age=%d,enseigne a = %s étudie à %s", nom, age, teachingUniNames, studyUniNames);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Personne) {
			Personne autre = (Personne) obj;
			// On compare les primitif avec ==
			// et les objets (comme les chaines) avec equals)
			return (this.age == autre.age) && (this.nom.equals(autre.nom));
		}

		return false;
	}

}
