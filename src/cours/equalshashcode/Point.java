package cours.equalshashcode;

public class Point {
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
	public boolean equals(Object o) {
		// On vérifie que c'est pas nous :
		if (this == o) {
			return true;
		}
		// On vérifie que c'est du bon type
		if (o instanceof Point) {

			// On caste :
			Point autre = (Point) o;

			return (this.x == autre.x) && (this.y == autre.y);
		}

		// Dans les cas contraires, on retourne faux
		return false;
	}

	// On peut écrire en condensé :
//	public boolean equals(Object o) {
//		return o == this ? true : (o instanceof Point) && (((Point) o).x == this.x) && (((Point) o).y == this.y);
//	}

}
