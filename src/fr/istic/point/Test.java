package fr.istic.point;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Test {

  // public static void add1ToX(PointZ p) {
  // p.setX(p.getX() + 10);
  // }

  public static void add1ToX(Point p) {
    p.setX(p.getX() + 1);
  }

  public static void main(String[] args) {

    PointZ p3 = new PointZ(1, 2, 3, Color.ROUGE);
    PointColor pc = new PointColor(1, 2, Color.ROUGE);
    Point p = new Point(1, 2);
    PointMagique pm = new PointMagique(1, 2);

    List<Point> l = new LinkedList<>();
    l.add(p);
    l.add(pc);
    l.add(p3);
    l.add(pm);

    for (Point point : l) {
      System.out.println("Avant " + point);
      add1ToX(point);
      System.out.println("Apres " + point);
    }

    Collection<Integer> col = new HashSet();
    // new ArrayList<Integer>();
    // new TreeSet();
    col.add(50);
    col.add(1);
    col.add(1);
    col.add(1);
    col.add(3);
    col.add(2);

    System.out.println(col);

  }
}
