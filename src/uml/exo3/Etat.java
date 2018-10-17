package uml.exo3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Etat {
	String nom;
	String capitale;
	List<University> universities;

	public Etat(String nom, String capitale) {
		super();
		this.nom = nom;
		this.capitale = capitale;
		this.universities = new ArrayList<>();
	}

	@Override
	public String toString() {
		List<String> uniNames = new ArrayList<>();
		for (University uni : universities) {
			uniNames.add(uni.getNom());
		}
		return String.format("etat=%s, capitale=%s, uniNames= %s", this.getNom(), this.capitale, uniNames);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCapitale() {
		return capitale;
	}

	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	public void addUni(University u) {
		if (!universities.contains(u)) {
			this.universities.add(u);
			u.addState(this);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Etat) {
			Etat autre = (Etat) obj;
			return this.nom.equals(autre.nom);
		}
		return false;
	}
}
