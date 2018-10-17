package uml.exo3;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Personne p1 = new Personne("John", 27);
		Personne p2 = new Personne("Maria", 19);
		Personne p3 = new Personne("Niels", 20);
		Personne p4 = new Personne("Mohamed", 45);

		Etat e1 = new Etat("France", "Paris");

		University u1 = new University("Istic", "Rennes");
		University u2 = new University("Sorbonne", "Paris");

		u1.addTeacher(p4);

		p4.teachAt(u1);
		p2.studyAt(u2);
		p2.stopStudyingAt(u2);
		p1.studyAt(u2);
		p2.studyAt(u1);
		p3.studyAt(u1);
		p4.studyAt(u2);

		List<Personne> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		e1.addUni(u1);
		e1.addUni(u2);

		for (Personne personne : list) {
			System.out.println(personne);
			System.out.println("----> enseigne ?" + personne.isTeaching());
			System.out.println("----> etudie a la Sorbonne ?" + personne.isStudyingAt(u2.getNom()));
		}

		List<University> unis = new ArrayList<>();
		unis.add(u1);
		unis.add(u2);
		for (University university : unis) {
			System.out.println(university);
		}

		System.out.println(e1);

	}
}
