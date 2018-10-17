package uml.exo3;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String nom;
	private String ville;
	private List<Personne> students;
	private List<Personne> teachers;

	public University(String nom, String ville) {
		super();
		this.setNom(nom);
		this.ville = ville;
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
	}

	@Override
	public String toString() {
		List<String> teachersNames = new ArrayList<>();
		for (Personne p : teachers) {
			teachersNames.add(p.getNom());
		}

		List<String> studentsNames = new ArrayList<>();
		for (Personne p : students) {
			studentsNames.add(p.getNom());
		}
		return String.format("nom=%s, ville=%s, teachers = %s, students = %s", this.getNom(), this.ville, teachersNames,
				studentsNames);
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addTeacher(Personne teacher) {
		// Pour éviter de boucler indéfiniment, on utilise contains ce qui
		// permet de vérifier que l'enseignant n'est pas déjà dans l'université.
		if (!teachers.contains(teacher)) {
			this.teachers.add(teacher);
			// On réalise l'opération symétrique :
			teacher.teachAt(this);
		}

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Test égalite avec" + obj);
		if (obj instanceof University) {
			University autre = (University) obj;
			return this.nom.equals(autre.nom) && this.ville.equals(autre.ville);
			// On peut écrire en une seule ligne :
			// return (this.nom.equals(((University) obj).getNom()) &&
			// this.ville.equals(((University) obj).getVille()));

		}
		return false;
	}

}
