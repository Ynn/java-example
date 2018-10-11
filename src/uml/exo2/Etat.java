package uml.exo2;

import java.util.ArrayList;
import java.util.List;

public class Etat {
	private String capitale;
	private String nom;
	private List<Etat> voisins;

	public Etat(String capitale, String nom, List<Etat> voisins) {
		super();
		this.capitale = capitale;
		this.nom = nom;
		this.voisins = voisins;
	}

	public Etat(String capitale, String nom) {
		this(capitale, nom, new ArrayList<Etat>());
	}

	public String getCapitale() {
		return capitale;
	}

	public void setCapitale(String capitale) {

		this.capitale = capitale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if ((nom != null) && (nom.isEmpty())) {
			this.nom = nom;
		} else {
			throw new IllegalArgumentException("le nom n'est pas correct");
		}
	}

	public List<Etat> getVoisins() {
		return voisins;
	}

	public void setVoisins(List<Etat> voisins) {
		this.voisins = voisins;
	}

	@Override
	public String toString() {
		String lesVoisins = "";
		for (Etat etat : voisins) {
			lesVoisins += etat.toString();
		}
		return String.format("Etat [capitale=%s, nom=%s,voisins=%s]", capitale, nom, lesVoisins);

	}

	public void ajouterVoisin(Etat voisin) {
		voisin.voisins.add(this);
		this.voisins.add(voisin);

	}
}
