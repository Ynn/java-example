package cours.equalshashcode;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = p1;

		System.out.println(p1);
		System.out.println(p2);

		System.out.println(p1 == p2);
		System.out.println(p1 == p3);

		// A tester avec et sans equals dans Point
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
