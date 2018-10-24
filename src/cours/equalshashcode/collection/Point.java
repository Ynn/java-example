package cours.equalshashcode.collection;

public class Point implements Comparable<Point> {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}

	@Override
	public int hashCode() {
		return x - y;
	}

	// On peut écrire en condensé :
	@Override
	public boolean equals(Object o) {
//		System.out.println("Fait appel a equals");

		return o == this ? true : (o instanceof Point) && (((Point) o).x == this.x) && (((Point) o).y == this.y);
	}

	public double norme() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	@Override
	public int compareTo(Point o) {
		if (this.equals(o)) {
			return 0;
		}
		if (this.norme() > o.norme()) {
			// je retourne un truc positif :
			return 17382438;
		} else {
			// retourne un nombre négatif (ici au pif en général -1)
			return -37313498;
		}

	}

}
