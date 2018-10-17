package uml.exo3;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String nom;
	private String ville;
	private List<Personne> students;
	private List<Personne> teachers;
	private List<Etat> etats;

	public University(String nom, String ville) {
		super();
		this.setNom(nom);
		this.ville = ville;
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.etats = new ArrayList<>();
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

		List<String> statesNames = new ArrayList<>();
		for (Etat e : etats) {
			statesNames.add(e.getNom());
		}
		return String.format("nom=%s, ville=%s, teachers = %s, students = %s, etats = %s", this.getNom(), this.ville,
				teachersNames, studentsNames, statesNames);
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

	public void addState(Etat e) {
		// On vérifie que l'état n'est pas déjà présent
		if (!etats.contains(e)) {
			this.etats.add(e);
			e.addUni(this);
		}
	}

	public void addStudent(Personne student) {
		// Pour éviter de boucler indéfiniment, on utilise contains ce qui
		// permet de vérifier que l'enseignant n'est pas déjà dans l'université.
		if (!students.contains(student)) {
			this.students.add(student);
			// On réalise l'opération symétrique :
			student.studyAt(this);
		}
	}

	public void removeStudent(Personne student) {
		if (students.contains(student)) {
			// opération symétrique :
			this.students.remove(student);
			student.stopStudyingAt(this);
		}
	}

	@Override
	public boolean equals(Object obj) {
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
