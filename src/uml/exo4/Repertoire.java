//%% NEW FILE Repertoire BEGINS HERE %%

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/

package uml.exo4;

import java.util.*;

// line 10 "../../../../../../../ump/tmp308177/model.ump"
// line 24 "../../../../../../../ump/tmp308177/model.ump"
public class Repertoire {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Repertoire Attributes
	private String nom;

	// Repertoire Associations
	private List<Fichier> fichiers;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Repertoire(String aNom) {
		nom = aNom;
		fichiers = new ArrayList<Fichier>();
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setNom(String aNom) {
		boolean wasSet = false;
		nom = aNom;
		wasSet = true;
		return wasSet;
	}

	public String getNom() {
		return nom;
	}

	/* Code from template association_GetMany */
	public Fichier getFichier(int index) {
		Fichier aFichier = fichiers.get(index);
		return aFichier;
	}

	public List<Fichier> getFichiers() {
		List<Fichier> newFichiers = Collections.unmodifiableList(fichiers);
		return newFichiers;
	}

	public int numberOfFichiers() {
		int number = fichiers.size();
		return number;
	}

	public boolean hasFichiers() {
		boolean has = fichiers.size() > 0;
		return has;
	}

	public int indexOfFichier(Fichier aFichier) {
		int index = fichiers.indexOf(aFichier);
		return index;
	}

	/* Code from template association_MinimumNumberOfMethod */
	public static int minimumNumberOfFichiers() {
		return 0;
	}

	/* Code from template association_AddManyToManyMethod */
	public boolean addFichier(Fichier aFichier) {
		boolean wasAdded = false;
		if (fichiers.contains(aFichier)) {
			return false;
		}
		fichiers.add(aFichier);
		if (aFichier.indexOfRepertoire(this) != -1) {
			wasAdded = true;
		} else {
			wasAdded = aFichier.addRepertoire(this);
			if (!wasAdded) {
				fichiers.remove(aFichier);
			}
		}
		return wasAdded;
	}

	/* Code from template association_RemoveMany */
	public boolean removeFichier(Fichier aFichier) {
		boolean wasRemoved = false;
		if (!fichiers.contains(aFichier)) {
			return wasRemoved;
		}

		int oldIndex = fichiers.indexOf(aFichier);
		fichiers.remove(oldIndex);
		if (aFichier.indexOfRepertoire(this) == -1) {
			wasRemoved = true;
		} else {
			wasRemoved = aFichier.removeRepertoire(this);
			if (!wasRemoved) {
				fichiers.add(oldIndex, aFichier);
			}
		}
		return wasRemoved;
	}

	/* Code from template association_AddIndexControlFunctions */
	public boolean addFichierAt(Fichier aFichier, int index) {
		boolean wasAdded = false;
		if (addFichier(aFichier)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfFichiers()) {
				index = numberOfFichiers() - 1;
			}
			fichiers.remove(aFichier);
			fichiers.add(index, aFichier);
			wasAdded = true;
		}
		return wasAdded;
	}

	public boolean addOrMoveFichierAt(Fichier aFichier, int index) {
		boolean wasAdded = false;
		if (fichiers.contains(aFichier)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfFichiers()) {
				index = numberOfFichiers() - 1;
			}
			fichiers.remove(aFichier);
			fichiers.add(index, aFichier);
			wasAdded = true;
		} else {
			wasAdded = addFichierAt(aFichier, index);
		}
		return wasAdded;
	}

	public void delete() {
		ArrayList<Fichier> copyOfFichiers = new ArrayList<Fichier>(fichiers);
		fichiers.clear();
		for (Fichier aFichier : copyOfFichiers) {
			aFichier.removeRepertoire(this);
		}
	}

	@Override
	public String toString() {
		return "[" + "nom" + ":" + getNom() + " fichiers =" + fichiers + " ]";
	}
}

//%% NEW FILE Fichier BEGINS HERE %%

/* PLEASE DO NOT EDIT THIS CODE */
/*
 * This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling
 * language!
 */
