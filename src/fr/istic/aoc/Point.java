package fr.istic.aoc;

public class Point {

  public static double PI;
  private double x;
  private double y;

  public static void calculePi() {
    PI = 3.14;
  }

  public Point(double x, double y) {
    super();
    this.x = x;
    this.y = y;
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

}
