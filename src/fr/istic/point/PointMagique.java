package fr.istic.point;

public class PointMagique extends Point {

  public PointMagique(double x, double yy) {
    super(x, yy);
  }

  @Override
  public String toString() {
    return super.toString() + " et je suis magique !";
  }
}
