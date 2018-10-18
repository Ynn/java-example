//%% NEW FILE Node BEGINS HERE %%

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/

package uml.exo5;

// line 15 "../../../../../ump/tmp308177/model.ump"
// line 34 "../../../../../ump/tmp308177/model.ump"
public class Node {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Node Attributes
	private String name;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Node(String aName) {
		name = aName;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setName(String aName) {
		boolean wasSet = false;
		name = aName;
		wasSet = true;
		return wasSet;
	}

	public String getName() {
		return name;
	}

	public void delete() {
	}

	@Override
	public String toString() {
		return "[" + "name" + ":" + getName() + "]";
	}
}

//%% NEW FILE Repertoire BEGINS HERE %%

/* PLEASE DO NOT EDIT THIS CODE */
/*
 * This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling
 * language!
 */
