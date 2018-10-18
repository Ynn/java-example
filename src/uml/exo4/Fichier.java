package uml.exo4;

import java.util.*;

/**
 * Positioning
 */
// line 4 "../../../../../../../ump/tmp308177/model.ump"
// line 18 "../../../../../../../ump/tmp308177/model.ump"
public class Fichier {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Fichier Attributes
	private String nom;

	// Fichier Associations
	private List<Repertoire> repertoires;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Fichier(String aNom) {
		nom = aNom;
		repertoires = new ArrayList<Repertoire>();
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
	public Repertoire getRepertoire(int index) {
		Repertoire aRepertoire = repertoires.get(index);
		return aRepertoire;
	}

	public List<Repertoire> getRepertoires() {
		List<Repertoire> newRepertoires = Collections.unmodifiableList(repertoires);
		return newRepertoires;
	}

	public int numberOfRepertoires() {
		int number = repertoires.size();
		return number;
	}

	public boolean hasRepertoires() {
		boolean has = repertoires.size() > 0;
		return has;
	}

	public int indexOfRepertoire(Repertoire aRepertoire) {
		int index = repertoires.indexOf(aRepertoire);
		return index;
	}

	/* Code from template association_MinimumNumberOfMethod */
	public static int minimumNumberOfRepertoires() {
		return 0;
	}

	/* Code from template association_AddManyToManyMethod */
	public boolean addRepertoire(Repertoire aRepertoire) {
		boolean wasAdded = false;
		if (repertoires.contains(aRepertoire)) {
			return false;
		}
		repertoires.add(aRepertoire);
		if (aRepertoire.indexOfFichier(this) != -1) {
			wasAdded = true;
		} else {
			wasAdded = aRepertoire.addFichier(this);
			if (!wasAdded) {
				repertoires.remove(aRepertoire);
			}
		}
		return wasAdded;
	}

	/* Code from template association_RemoveMany */
	public boolean removeRepertoire(Repertoire aRepertoire) {
		boolean wasRemoved = false;
		if (!repertoires.contains(aRepertoire)) {
			return wasRemoved;
		}

		int oldIndex = repertoires.indexOf(aRepertoire);
		repertoires.remove(oldIndex);
		if (aRepertoire.indexOfFichier(this) == -1) {
			wasRemoved = true;
		} else {
			wasRemoved = aRepertoire.removeFichier(this);
			if (!wasRemoved) {
				repertoires.add(oldIndex, aRepertoire);
			}
		}
		return wasRemoved;
	}

	/* Code from template association_AddIndexControlFunctions */
	public boolean addRepertoireAt(Repertoire aRepertoire, int index) {
		boolean wasAdded = false;
		if (addRepertoire(aRepertoire)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfRepertoires()) {
				index = numberOfRepertoires() - 1;
			}
			repertoires.remove(aRepertoire);
			repertoires.add(index, aRepertoire);
			wasAdded = true;
		}
		return wasAdded;
	}

	public boolean addOrMoveRepertoireAt(Repertoire aRepertoire, int index) {
		boolean wasAdded = false;
		if (repertoires.contains(aRepertoire)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfRepertoires()) {
				index = numberOfRepertoires() - 1;
			}
			repertoires.remove(aRepertoire);
			repertoires.add(index, aRepertoire);
			wasAdded = true;
		} else {
			wasAdded = addRepertoireAt(aRepertoire, index);
		}
		return wasAdded;
	}

	public void delete() {
		ArrayList<Repertoire> copyOfRepertoires = new ArrayList<Repertoire>(repertoires);
		repertoires.clear();
		for (Repertoire aRepertoire : copyOfRepertoires) {
			aRepertoire.removeFichier(this);
		}
	}

	@Override
	public String toString() {
		return "[" + "nom" + ":" + getNom() + "]";
	}
}