package uml.exo5;

import java.util.*;

// line 9 "../../../../../ump/tmp308177/model.ump"
// line 29 "../../../../../ump/tmp308177/model.ump"
public class Repertoire extends Node {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Repertoire Associations
	private List<Node> nodes;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Repertoire(String aName) {
		super(aName);
		nodes = new ArrayList<Node>();
	}

	// ------------------------
	// INTERFACE
	// ------------------------
	/* Code from template association_GetMany */
	public Node getNode(int index) {
		Node aNode = nodes.get(index);
		return aNode;
	}

	public List<Node> getNodes() {
		List<Node> newNodes = Collections.unmodifiableList(nodes);
		return newNodes;
	}

	public int numberOfNodes() {
		int number = nodes.size();
		return number;
	}

	public boolean hasNodes() {
		boolean has = nodes.size() > 0;
		return has;
	}

	public int indexOfNode(Node aNode) {
		int index = nodes.indexOf(aNode);
		return index;
	}

	/* Code from template association_MinimumNumberOfMethod */
	public static int minimumNumberOfNodes() {
		return 0;
	}

	/* Code from template association_AddUnidirectionalMany */
	public boolean addNode(Node aNode) {
		boolean wasAdded = false;
		if (nodes.contains(aNode)) {
			return false;
		}
		nodes.add(aNode);
		wasAdded = true;
		return wasAdded;
	}

	public boolean removeNode(Node aNode) {
		boolean wasRemoved = false;
		if (nodes.contains(aNode)) {
			nodes.remove(aNode);
			wasRemoved = true;
		}
		return wasRemoved;
	}

	/* Code from template association_AddIndexControlFunctions */
	public boolean addNodeAt(Node aNode, int index) {
		boolean wasAdded = false;
		if (addNode(aNode)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfNodes()) {
				index = numberOfNodes() - 1;
			}
			nodes.remove(aNode);
			nodes.add(index, aNode);
			wasAdded = true;
		}
		return wasAdded;
	}

	public boolean addOrMoveNodeAt(Node aNode, int index) {
		boolean wasAdded = false;
		if (nodes.contains(aNode)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfNodes()) {
				index = numberOfNodes() - 1;
			}
			nodes.remove(aNode);
			nodes.add(index, aNode);
			wasAdded = true;
		} else {
			wasAdded = addNodeAt(aNode, index);
		}
		return wasAdded;
	}

	@Override
	public void delete() {
		nodes.clear();
		super.delete();
	}

	@Override
	public String toString() {
		return super.toString() + " contient : " + nodes;
	}

}

//%% NEW FILE Fichier BEGINS HERE %%

/* PLEASE DO NOT EDIT THIS CODE */
/*
 * This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling
 * language!
 */
