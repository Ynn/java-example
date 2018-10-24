package cours.reference.en.java.point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPoints {

	public static void main(String[] args) {
		Point p = new Point(new int[] { 1, 2 });
		System.out.println(p);
		int[] coordsP = p.getCoords();
		System.out.println(Arrays.toString(coordsP));

		coordsP[0] = 156;

		System.out.println(p);

		coordsP = p.getCoordsCopy();
		coordsP[0] = 657;
		coordsP[1] = 888;
		System.out.println(p);

		System.out.println("-----");
		int[] coord = new int[] { 0, 0 };
		Point p1 = new Point(coord);
		coord[0] = 10;
		coord[1] = 10;
		Point p2 = new Point(coord);

		p1.ajoute1aX();
		System.out.println(p1);
		System.out.println(p2);
	}

}
