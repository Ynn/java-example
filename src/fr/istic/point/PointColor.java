package fr.istic.point;

public class PointColor extends Point {

  Color couleur;

  public PointColor(double x, double y, Color c) {
    super(x, y);

    System.out.println("Initialisation de PointColor");
    this.couleur = c;
  }

  @Override
  public String toString() {
    return super.toString() + " " + couleur;
  }

}
