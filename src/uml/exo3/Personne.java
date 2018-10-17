package uml.exo3;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Personne.
 */
public class Personne {

	/** The nom. */
	private String nom;

	/** The age. */
	private int age;

	/** The studying uni. */
	private List<University> studyingUni;

	/** The teaching uni. */
	private List<University> teachingUni;

	/**
	 * Instantiates a new personne.
	 *
	 * @param nom the nom
	 * @param age the age
	 */
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		this.studyingUni = new ArrayList<University>();
		this.teachingUni = new ArrayList<University>();
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Teach at.
	 *
	 * @param u the u
	 */
	public void teachAt(University u) {
		if (!teachingUni.contains(u)) {
			this.teachingUni.add(u);
			u.addTeacher(this);
		}
	}

	public void studyAt(University university) {
		// On évite de boucler en vérifiant que l'étudiant n'est pas déjà dans
		// l'université.
		if (!studyingUni.contains(university)) {
			// ajoute l'université a étudiant
			this.studyingUni.add(university);
			// ajoute l'étudiant à l'université:
			university.addStudent(this);
		}
	}

	public void stopStudyingAt(University u) {
		if (studyingUni.contains(u)) {
			// l'opération est symétrique :
			this.studyingUni.remove(u);
			u.removeStudent(this);
		}
	}

	/**
	 * Checks if the person is teaching.
	 *
	 * @return true, if the person is teaching in an university
	 */
	public boolean isTeaching() {
		// on enseigne au moins dans une university :
		return !this.teachingUni.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	public boolean isStudyingAt(String nom) {
		for (University university : studyingUni) {
			if (university.getNom().equals(nom)) {
				return true;
			}
		}
		return false;
	}

}
