package fr.istic.point;

public class Point {

  /** The x coordinates */
  private double x;
  private double y;

  // public Point() {
  // System.out.println("Initialisation de Point");
  // x = 3;
  // y = 3;
  // }

  public Point(double x, double yy) {
    System.out.println("Initialisation de Point");
    this.x = x;
    y = yy;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public String toString() {
    super.toString();
    return String.format("[%.2f;%.2f]", this.x, this.y);
  }
}
