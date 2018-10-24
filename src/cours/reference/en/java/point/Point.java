package cours.reference.en.java.point;

import java.util.Arrays;

class Point {

	private int[] coords;

	public Point(int[] coords) {
		super();
		this.coords = coords;
	}

	public int[] getCoords() {
		// ici on renvoie directement un accès aux coordonnées
		return coords;
	}

	public int[] getCoordsCopy() {
		int[] copy = new int[coords.length];
		// On fait une copy
		System.arraycopy(coords, 0, copy, 0, coords.length);

		// De cette façon l'utilisateur ne peut pas modifier
		// l'état interne
		return copy;
	}

	public void setCoords(int[] coords) {
		this.coords = coords;
	}

	public void ajoute1aX() {
		coords[0] += 1;
	}

	@Override
	public String toString() {
		return Arrays.toString(coords);
	}
}