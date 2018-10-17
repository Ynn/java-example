package uml.exo3;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Personne p1 = new Personne("John", 27);
		Personne p2 = new Personne("Maria", 19);
		Personne p3 = new Personne("Niels", 20);
		Personne p4 = new Personne("Mohamed", 45);

		University u1 = new University("Istic", "Rennes");
		University u2 = new University("Sorbonne", "Paris");
		University u3 = new University("Istic", "Rennes");

		u1.addTeacher(p4);
		p4.teachAt(u3);

		List<Personne> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		for (Personne personne : list) {
			System.out.println(personne);
		}

		List<University> unis = new ArrayList<>();
		unis.add(u1);
		unis.add(u2);
		for (University university : unis) {
			System.out.println(university);
		}

	}
}
